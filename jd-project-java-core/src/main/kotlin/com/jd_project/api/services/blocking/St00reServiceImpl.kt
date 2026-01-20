// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.blocking

import com.jd_project.api.core.ClientOptions
import com.jd_project.api.core.RequestOptions
import com.jd_project.api.core.handlers.errorBodyHandler
import com.jd_project.api.core.handlers.errorHandler
import com.jd_project.api.core.handlers.jsonHandler
import com.jd_project.api.core.http.HttpMethod
import com.jd_project.api.core.http.HttpRequest
import com.jd_project.api.core.http.HttpResponse
import com.jd_project.api.core.http.HttpResponse.Handler
import com.jd_project.api.core.http.HttpResponseFor
import com.jd_project.api.core.http.parseable
import com.jd_project.api.core.prepare
import com.jd_project.api.models.st00re.St00reListInventoryParams
import com.jd_project.api.models.st00re.St00reListInventoryResponse
import com.jd_project.api.services.blocking.st00re.OrderService
import com.jd_project.api.services.blocking.st00re.OrderServiceImpl
import java.util.function.Consumer

class St00reServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    St00reService {

    private val withRawResponse: St00reService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val orders: OrderService by lazy { OrderServiceImpl(clientOptions) }

    override fun withRawResponse(): St00reService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): St00reService =
        St00reServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun orders(): OrderService = orders

    override fun listInventory(
        params: St00reListInventoryParams,
        requestOptions: RequestOptions,
    ): St00reListInventoryResponse =
        // get /st00re/inventory
        withRawResponse().listInventory(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        St00reService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val orders: OrderService.WithRawResponse by lazy {
            OrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): St00reService.WithRawResponse =
            St00reServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun orders(): OrderService.WithRawResponse = orders

        private val listInventoryHandler: Handler<St00reListInventoryResponse> =
            jsonHandler<St00reListInventoryResponse>(clientOptions.jsonMapper)

        override fun listInventory(
            params: St00reListInventoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<St00reListInventoryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("st00re", "inventory")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listInventoryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}

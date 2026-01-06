// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.async

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
import com.jd_project.api.core.prepareAsync
import com.jd_project.api.models.st0re.St0reListInventoryParams
import com.jd_project.api.models.st0re.St0reListInventoryResponse
import com.jd_project.api.services.async.st0re.OrderServiceAsync
import com.jd_project.api.services.async.st0re.OrderServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class St0reServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    St0reServiceAsync {

    private val withRawResponse: St0reServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val orders: OrderServiceAsync by lazy { OrderServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): St0reServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): St0reServiceAsync =
        St0reServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun orders(): OrderServiceAsync = orders

    override fun listInventory(
        params: St0reListInventoryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<St0reListInventoryResponse> =
        // get /st0re/inventory
        withRawResponse().listInventory(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        St0reServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val orders: OrderServiceAsync.WithRawResponse by lazy {
            OrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): St0reServiceAsync.WithRawResponse =
            St0reServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun orders(): OrderServiceAsync.WithRawResponse = orders

        private val listInventoryHandler: Handler<St0reListInventoryResponse> =
            jsonHandler<St0reListInventoryResponse>(clientOptions.jsonMapper)

        override fun listInventory(
            params: St0reListInventoryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<St0reListInventoryResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("st0re", "inventory")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}

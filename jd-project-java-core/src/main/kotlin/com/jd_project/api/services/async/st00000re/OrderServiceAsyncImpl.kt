// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.async.st00000re

import com.jd_project.api.core.ClientOptions
import com.jd_project.api.core.RequestOptions
import com.jd_project.api.core.checkRequired
import com.jd_project.api.core.handlers.emptyHandler
import com.jd_project.api.core.handlers.errorBodyHandler
import com.jd_project.api.core.handlers.errorHandler
import com.jd_project.api.core.handlers.jsonHandler
import com.jd_project.api.core.http.HttpMethod
import com.jd_project.api.core.http.HttpRequest
import com.jd_project.api.core.http.HttpResponse
import com.jd_project.api.core.http.HttpResponse.Handler
import com.jd_project.api.core.http.HttpResponseFor
import com.jd_project.api.core.http.json
import com.jd_project.api.core.http.parseable
import com.jd_project.api.core.prepareAsync
import com.jd_project.api.models.Order
import com.jd_project.api.models.st00000re.orders.OrderCreateParams
import com.jd_project.api.models.st00000re.orders.OrderDeleteParams
import com.jd_project.api.models.st00000re.orders.OrderRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OrderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OrderServiceAsync {

    private val withRawResponse: OrderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OrderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrderServiceAsync =
        OrderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: OrderCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Order> =
        // post /st00000re/order
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: OrderRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Order> =
        // get /st00000re/order/{orderId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: OrderDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /st00000re/order/{orderId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrderServiceAsync.WithRawResponse =
            OrderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Order> = jsonHandler<Order>(clientOptions.jsonMapper)

        override fun create(
            params: OrderCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Order>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("st00000re", "order")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<Order> = jsonHandler<Order>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OrderRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Order>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orderId", params.orderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("st00000re", "order", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: OrderDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orderId", params.orderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("st00000re", "order", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}

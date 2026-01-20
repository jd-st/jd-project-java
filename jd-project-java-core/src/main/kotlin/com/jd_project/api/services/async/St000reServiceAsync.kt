// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.async

import com.jd_project.api.core.ClientOptions
import com.jd_project.api.core.RequestOptions
import com.jd_project.api.core.http.HttpResponseFor
import com.jd_project.api.models.st000re.St000reListInventoryParams
import com.jd_project.api.models.st000re.St000reListInventoryResponse
import com.jd_project.api.services.async.st000re.OrderServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface St000reServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): St000reServiceAsync

    fun orders(): OrderServiceAsync

    /** Returns a map of status codes to quantities */
    fun listInventory(): CompletableFuture<St000reListInventoryResponse> =
        listInventory(St000reListInventoryParams.none())

    /** @see listInventory */
    fun listInventory(
        params: St000reListInventoryParams = St000reListInventoryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<St000reListInventoryResponse>

    /** @see listInventory */
    fun listInventory(
        params: St000reListInventoryParams = St000reListInventoryParams.none()
    ): CompletableFuture<St000reListInventoryResponse> =
        listInventory(params, RequestOptions.none())

    /** @see listInventory */
    fun listInventory(
        requestOptions: RequestOptions
    ): CompletableFuture<St000reListInventoryResponse> =
        listInventory(St000reListInventoryParams.none(), requestOptions)

    /**
     * A view of [St000reServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): St000reServiceAsync.WithRawResponse

        fun orders(): OrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /st000re/inventory`, but is otherwise the same as
         * [St000reServiceAsync.listInventory].
         */
        fun listInventory(): CompletableFuture<HttpResponseFor<St000reListInventoryResponse>> =
            listInventory(St000reListInventoryParams.none())

        /** @see listInventory */
        fun listInventory(
            params: St000reListInventoryParams = St000reListInventoryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<St000reListInventoryResponse>>

        /** @see listInventory */
        fun listInventory(
            params: St000reListInventoryParams = St000reListInventoryParams.none()
        ): CompletableFuture<HttpResponseFor<St000reListInventoryResponse>> =
            listInventory(params, RequestOptions.none())

        /** @see listInventory */
        fun listInventory(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<St000reListInventoryResponse>> =
            listInventory(St000reListInventoryParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.async

import com.jd_project.api.core.ClientOptions
import com.jd_project.api.core.RequestOptions
import com.jd_project.api.core.http.HttpResponseFor
import com.jd_project.api.models.st00000re.St00000reListInventoryParams
import com.jd_project.api.models.st00000re.St00000reListInventoryResponse
import com.jd_project.api.services.async.st00000re.OrderServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface St00000reServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): St00000reServiceAsync

    fun orders(): OrderServiceAsync

    /** Returns a map of status codes to quantities */
    fun listInventory(): CompletableFuture<St00000reListInventoryResponse> =
        listInventory(St00000reListInventoryParams.none())

    /** @see listInventory */
    fun listInventory(
        params: St00000reListInventoryParams = St00000reListInventoryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<St00000reListInventoryResponse>

    /** @see listInventory */
    fun listInventory(
        params: St00000reListInventoryParams = St00000reListInventoryParams.none()
    ): CompletableFuture<St00000reListInventoryResponse> =
        listInventory(params, RequestOptions.none())

    /** @see listInventory */
    fun listInventory(
        requestOptions: RequestOptions
    ): CompletableFuture<St00000reListInventoryResponse> =
        listInventory(St00000reListInventoryParams.none(), requestOptions)

    /**
     * A view of [St00000reServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): St00000reServiceAsync.WithRawResponse

        fun orders(): OrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /st00000re/inventory`, but is otherwise the same as
         * [St00000reServiceAsync.listInventory].
         */
        fun listInventory(): CompletableFuture<HttpResponseFor<St00000reListInventoryResponse>> =
            listInventory(St00000reListInventoryParams.none())

        /** @see listInventory */
        fun listInventory(
            params: St00000reListInventoryParams = St00000reListInventoryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<St00000reListInventoryResponse>>

        /** @see listInventory */
        fun listInventory(
            params: St00000reListInventoryParams = St00000reListInventoryParams.none()
        ): CompletableFuture<HttpResponseFor<St00000reListInventoryResponse>> =
            listInventory(params, RequestOptions.none())

        /** @see listInventory */
        fun listInventory(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<St00000reListInventoryResponse>> =
            listInventory(St00000reListInventoryParams.none(), requestOptions)
    }
}

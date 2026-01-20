// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.async

import com.jd_project.api.core.ClientOptions
import com.jd_project.api.core.RequestOptions
import com.jd_project.api.core.http.HttpResponseFor
import com.jd_project.api.models.st00re.St00reListInventoryParams
import com.jd_project.api.models.st00re.St00reListInventoryResponse
import com.jd_project.api.services.async.st00re.OrderServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface St00reServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): St00reServiceAsync

    fun orders(): OrderServiceAsync

    /** Returns a map of status codes to quantities */
    fun listInventory(): CompletableFuture<St00reListInventoryResponse> =
        listInventory(St00reListInventoryParams.none())

    /** @see listInventory */
    fun listInventory(
        params: St00reListInventoryParams = St00reListInventoryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<St00reListInventoryResponse>

    /** @see listInventory */
    fun listInventory(
        params: St00reListInventoryParams = St00reListInventoryParams.none()
    ): CompletableFuture<St00reListInventoryResponse> = listInventory(params, RequestOptions.none())

    /** @see listInventory */
    fun listInventory(
        requestOptions: RequestOptions
    ): CompletableFuture<St00reListInventoryResponse> =
        listInventory(St00reListInventoryParams.none(), requestOptions)

    /**
     * A view of [St00reServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): St00reServiceAsync.WithRawResponse

        fun orders(): OrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /st00re/inventory`, but is otherwise the same as
         * [St00reServiceAsync.listInventory].
         */
        fun listInventory(): CompletableFuture<HttpResponseFor<St00reListInventoryResponse>> =
            listInventory(St00reListInventoryParams.none())

        /** @see listInventory */
        fun listInventory(
            params: St00reListInventoryParams = St00reListInventoryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<St00reListInventoryResponse>>

        /** @see listInventory */
        fun listInventory(
            params: St00reListInventoryParams = St00reListInventoryParams.none()
        ): CompletableFuture<HttpResponseFor<St00reListInventoryResponse>> =
            listInventory(params, RequestOptions.none())

        /** @see listInventory */
        fun listInventory(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<St00reListInventoryResponse>> =
            listInventory(St00reListInventoryParams.none(), requestOptions)
    }
}

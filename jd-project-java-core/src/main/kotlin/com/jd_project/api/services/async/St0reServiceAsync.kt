// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.async

import com.jd_project.api.core.ClientOptions
import com.jd_project.api.core.RequestOptions
import com.jd_project.api.core.http.HttpResponseFor
import com.jd_project.api.models.st0re.St0reListInventoryParams
import com.jd_project.api.models.st0re.St0reListInventoryResponse
import com.jd_project.api.services.async.st0re.OrderServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface St0reServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): St0reServiceAsync

    fun orders(): OrderServiceAsync

    /** Returns a map of status codes to quantities */
    fun listInventory(): CompletableFuture<St0reListInventoryResponse> =
        listInventory(St0reListInventoryParams.none())

    /** @see listInventory */
    fun listInventory(
        params: St0reListInventoryParams = St0reListInventoryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<St0reListInventoryResponse>

    /** @see listInventory */
    fun listInventory(
        params: St0reListInventoryParams = St0reListInventoryParams.none()
    ): CompletableFuture<St0reListInventoryResponse> = listInventory(params, RequestOptions.none())

    /** @see listInventory */
    fun listInventory(
        requestOptions: RequestOptions
    ): CompletableFuture<St0reListInventoryResponse> =
        listInventory(St0reListInventoryParams.none(), requestOptions)

    /** A view of [St0reServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): St0reServiceAsync.WithRawResponse

        fun orders(): OrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /st0re/inventory`, but is otherwise the same as
         * [St0reServiceAsync.listInventory].
         */
        fun listInventory(): CompletableFuture<HttpResponseFor<St0reListInventoryResponse>> =
            listInventory(St0reListInventoryParams.none())

        /** @see listInventory */
        fun listInventory(
            params: St0reListInventoryParams = St0reListInventoryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<St0reListInventoryResponse>>

        /** @see listInventory */
        fun listInventory(
            params: St0reListInventoryParams = St0reListInventoryParams.none()
        ): CompletableFuture<HttpResponseFor<St0reListInventoryResponse>> =
            listInventory(params, RequestOptions.none())

        /** @see listInventory */
        fun listInventory(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<St0reListInventoryResponse>> =
            listInventory(St0reListInventoryParams.none(), requestOptions)
    }
}

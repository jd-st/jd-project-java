// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.jd_project.api.core.ClientOptions
import com.jd_project.api.core.RequestOptions
import com.jd_project.api.core.http.HttpResponseFor
import com.jd_project.api.models.st00re.St00reListInventoryParams
import com.jd_project.api.models.st00re.St00reListInventoryResponse
import com.jd_project.api.services.blocking.st00re.OrderService
import java.util.function.Consumer

interface St00reService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): St00reService

    fun orders(): OrderService

    /** Returns a map of status codes to quantities */
    fun listInventory(): St00reListInventoryResponse =
        listInventory(St00reListInventoryParams.none())

    /** @see listInventory */
    fun listInventory(
        params: St00reListInventoryParams = St00reListInventoryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): St00reListInventoryResponse

    /** @see listInventory */
    fun listInventory(
        params: St00reListInventoryParams = St00reListInventoryParams.none()
    ): St00reListInventoryResponse = listInventory(params, RequestOptions.none())

    /** @see listInventory */
    fun listInventory(requestOptions: RequestOptions): St00reListInventoryResponse =
        listInventory(St00reListInventoryParams.none(), requestOptions)

    /** A view of [St00reService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): St00reService.WithRawResponse

        fun orders(): OrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /st00re/inventory`, but is otherwise the same as
         * [St00reService.listInventory].
         */
        @MustBeClosed
        fun listInventory(): HttpResponseFor<St00reListInventoryResponse> =
            listInventory(St00reListInventoryParams.none())

        /** @see listInventory */
        @MustBeClosed
        fun listInventory(
            params: St00reListInventoryParams = St00reListInventoryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<St00reListInventoryResponse>

        /** @see listInventory */
        @MustBeClosed
        fun listInventory(
            params: St00reListInventoryParams = St00reListInventoryParams.none()
        ): HttpResponseFor<St00reListInventoryResponse> =
            listInventory(params, RequestOptions.none())

        /** @see listInventory */
        @MustBeClosed
        fun listInventory(
            requestOptions: RequestOptions
        ): HttpResponseFor<St00reListInventoryResponse> =
            listInventory(St00reListInventoryParams.none(), requestOptions)
    }
}

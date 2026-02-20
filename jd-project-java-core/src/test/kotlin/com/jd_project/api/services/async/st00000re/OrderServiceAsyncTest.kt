// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.async.st00000re

import com.jd_project.api.client.okhttp.JdProjectOkHttpClientAsync
import com.jd_project.api.models.Order
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrderServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.st00000re().orders()

        val orderFuture =
            orderServiceAsync.create(
                Order.builder()
                    .id(1L)
                    .complete(true)
                    .petId(1L)
                    .quantity(1)
                    .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(Order.Status.PLACED)
                    .build()
            )

        val order = orderFuture.get()
        order.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.st00000re().orders()

        val orderFuture = orderServiceAsync.retrieve(0L)

        val order = orderFuture.get()
        order.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.st00000re().orders()

        val future = orderServiceAsync.delete(0L)

        val response = future.get()
    }
}

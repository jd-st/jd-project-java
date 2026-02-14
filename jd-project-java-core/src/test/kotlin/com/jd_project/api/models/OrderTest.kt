// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.jd_project.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderTest {

    @Test
    fun create() {
        val order =
            Order.builder()
                .id(1L)
                .complete(true)
                .petId(1L)
                .quantity(1)
                .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(Order.Status.PLACED)
                .build()

        assertThat(order.id()).contains(1L)
        assertThat(order.complete()).contains(true)
        assertThat(order.petId()).contains(1L)
        assertThat(order.quantity()).contains(1)
        assertThat(order.shipDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(order.status()).contains(Order.Status.PLACED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val order =
            Order.builder()
                .id(1L)
                .complete(true)
                .petId(1L)
                .quantity(1)
                .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(Order.Status.PLACED)
                .build()

        val roundtrippedOrder =
            jsonMapper.readValue(jsonMapper.writeValueAsString(order), jacksonTypeRef<Order>())

        assertThat(roundtrippedOrder).isEqualTo(order)
    }
}

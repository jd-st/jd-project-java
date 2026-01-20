// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.models.st00re

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.jd_project.api.core.JsonValue
import com.jd_project.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class St00reListInventoryResponseTest {

    @Test
    fun create() {
        val st00reListInventoryResponse =
            St00reListInventoryResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(0))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val st00reListInventoryResponse =
            St00reListInventoryResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(0))
                .build()

        val roundtrippedSt00reListInventoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(st00reListInventoryResponse),
                jacksonTypeRef<St00reListInventoryResponse>(),
            )

        assertThat(roundtrippedSt00reListInventoryResponse).isEqualTo(st00reListInventoryResponse)
    }
}

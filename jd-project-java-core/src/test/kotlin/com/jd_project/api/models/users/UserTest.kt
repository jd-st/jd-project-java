// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.models.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.jd_project.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserTest {

    @Test
    fun create() {
        val user =
            User.builder()
                .id(1L)
                .email("take five")
                .firstName("take five")
                .lastName("take five")
                .password("take five")
                .phone("take five")
                .username("take five")
                .userStatus(1)
                .build()

        assertThat(user.id()).contains(1L)
        assertThat(user.email()).contains("take five")
        assertThat(user.firstName()).contains("take five")
        assertThat(user.lastName()).contains("take five")
        assertThat(user.password()).contains("take five")
        assertThat(user.phone()).contains("take five")
        assertThat(user.username()).contains("take five")
        assertThat(user.userStatus()).contains(1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val user =
            User.builder()
                .id(1L)
                .email("take five")
                .firstName("take five")
                .lastName("take five")
                .password("take five")
                .phone("take five")
                .username("take five")
                .userStatus(1)
                .build()

        val roundtrippedUser =
            jsonMapper.readValue(jsonMapper.writeValueAsString(user), jacksonTypeRef<User>())

        assertThat(roundtrippedUser).isEqualTo(user)
    }
}

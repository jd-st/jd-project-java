// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.services.async

import com.jd_project.api.client.okhttp.JdProjectOkHttpClientAsync
import com.jd_project.api.models.users.User
import com.jd_project.api.models.users.UserLoginParams
import com.jd_project.api.models.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val userFuture =
            userServiceAsync.create(
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
            )

        val user = userFuture.get()
        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val userFuture = userServiceAsync.retrieve("username")

        val user = userFuture.get()
        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val future =
            userServiceAsync.update(
                UserUpdateParams.builder()
                    .existingUsername("username")
                    .user(
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
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val future = userServiceAsync.delete("username")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createWithList() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val userFuture =
            userServiceAsync.createWithList(
                listOf(
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
                )
            )

        val user = userFuture.get()
        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun login() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val responseFuture =
            userServiceAsync.login(
                UserLoginParams.builder().password("password").username("username").build()
            )

        val response = responseFuture.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun logout() {
        val client = JdProjectOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val future = userServiceAsync.logout()

        val response = future.get()
    }
}

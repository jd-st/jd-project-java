// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.models.pets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.jd_project.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetTest {

    @Test
    fun create() {
        val pet =
            Pet.builder()
                .name("take five")
                .addPhotoUrl("take five")
                .id(1L)
                .category(Category.builder().id(1L).name("take five").build())
                .status(Pet.Status.AVAILABLE)
                .addTag(Pet.Tag.builder().id(1L).name("take five").build())
                .build()

        assertThat(pet.name()).isEqualTo("take five")
        assertThat(pet.photoUrls()).containsExactly("take five")
        assertThat(pet.id()).contains(1L)
        assertThat(pet.category()).contains(Category.builder().id(1L).name("take five").build())
        assertThat(pet.status()).contains(Pet.Status.AVAILABLE)
        assertThat(pet.tags().getOrNull())
            .containsExactly(Pet.Tag.builder().id(1L).name("take five").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pet =
            Pet.builder()
                .name("take five")
                .addPhotoUrl("take five")
                .id(1L)
                .category(Category.builder().id(1L).name("take five").build())
                .status(Pet.Status.AVAILABLE)
                .addTag(Pet.Tag.builder().id(1L).name("take five").build())
                .build()

        val roundtrippedPet =
            jsonMapper.readValue(jsonMapper.writeValueAsString(pet), jacksonTypeRef<Pet>())

        assertThat(roundtrippedPet).isEqualTo(pet)
    }
}

package com.example.core.domain.model.sandbox

import java.time.LocalDate

data class UserProfile (
    val userId: Int = 0,
    val lastName: String = "",
    val firstName: String = "",
    val lastNameKana: String = "",
    val firstNameKana: String = "",
    val gender: String = "",
    val telephoneNumber: String = "",
    val birthDate: LocalDate = LocalDate.now()
)
package com.example.core.application.repository.sandbox

import com.example.core.domain.model.sandbox.User
import com.example.core.domain.model.sandbox.UserProfile

interface UserRepository {
    fun select(id: Int): User

    fun selectUserProfile(id: Int): UserProfile
}
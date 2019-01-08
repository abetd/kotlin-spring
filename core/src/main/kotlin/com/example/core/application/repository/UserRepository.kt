package com.example.core.application.repository

import com.example.core.domain.model.User

interface UserRepository {
    fun select(id: Int): User
}
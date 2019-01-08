package com.example.core.application.service

import com.example.core.application.repository.UserRepository
import com.example.core.domain.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun select(id: Int): User {
        return userRepository.select(id)
    }
}
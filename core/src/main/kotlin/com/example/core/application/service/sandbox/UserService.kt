package com.example.core.application.service.sandbox

import com.example.core.application.repository.sandbox.UserRepository
import com.example.core.domain.model.sandbox.User
import com.example.core.domain.model.sandbox.UserProfile
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun select(id: Int): User {
        return userRepository.select(id)?: User()
    }

    fun selectUserProfile(id: Int): UserProfile {
        return userRepository.selectUserProfile(id)?: UserProfile()
    }
}
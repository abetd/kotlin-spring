package com.example.core.infrastructure.datasource.sandbox

import com.example.core.application.repository.sandbox.UserRepository
import com.example.core.domain.model.sandbox.User
import com.example.core.domain.model.sandbox.UserProfile
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class UserDatasource : UserRepository {

    @Autowired
    lateinit var userMapper: UserMapper

    @Autowired
    lateinit var userProfileMapper: UserProfileMapper

    override fun select(id: Int): User {
        return userMapper.select(id)
    }

    override fun selectUserProfile(id: Int): UserProfile {
        return userProfileMapper.select(id)
    }
}
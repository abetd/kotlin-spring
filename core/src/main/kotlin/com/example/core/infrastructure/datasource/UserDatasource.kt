package com.example.core.infrastructure.datasource

import com.example.core.application.repository.UserRepository
import com.example.core.domain.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class UserDatasource : UserRepository {

    @Autowired
    lateinit var userMapper: UserMapper

    override fun select(id: Int): User {
        return userMapper.select(id)
    }
}
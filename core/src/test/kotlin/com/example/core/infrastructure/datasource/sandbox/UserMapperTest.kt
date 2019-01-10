package com.example.core.infrastructure.datasource.sandbox

import com.example.core.TestConfiguration
import com.example.core.infrastructure.datasource.MemberSkillMapMapper
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@MybatisTest
@SpringBootTest(classes = arrayOf(TestConfiguration::class))
class UserMapperTest {

    @Autowired
    lateinit var skillMapMapper: MemberSkillMapMapper

    @Test
    @DisplayName("Mapperのテストサンプル")
    fun findAllSkillMap() {
        val actual = skillMapMapper.findAll()
        assertEquals(10, actual.size)
    }
}
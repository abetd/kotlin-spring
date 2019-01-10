package com.example.core.application.service.sandbox

import com.example.core.TestConfiguration
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import java.time.LocalDate

@ExtendWith(SpringExtension::class)
@SpringBootTest(classes = arrayOf(TestConfiguration::class))
class UserServiceTest {

    @Autowired
    lateinit var userService: UserService

    @Test
    @DisplayName("User検索")
    fun userSelect() {
        val actual = userService.select(1)
        assertEquals("hogehoge", actual.name)
    }

    @Test
    @DisplayName("UserProfile検索")
    fun userProfileSelect() {
        val actual = userService.selectUserProfile(1)
        assertAll(
            { assertEquals(1, actual.userId) },
            { assertEquals("今泉", actual.lastName) },
            { assertEquals("良和", actual.firstName) },
            { assertEquals("イマイズミ", actual.lastNameKana) },
            { assertEquals("ヨシカズ", actual.firstNameKana) },
            { assertEquals("男", actual.gender) },
            { assertEquals("0983228916", actual.telephoneNumber) },
            { assertEquals(LocalDate.of(1978, 4, 23), actual.birthDate) }
        )
    }
}
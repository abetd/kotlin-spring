package com.example.core

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SandboxTest {

    @Test
    @DisplayName("Hello World")
    fun hello() {
        val actual = "Hello World."
        assertEquals(actual, "Hello World.")
    }
}
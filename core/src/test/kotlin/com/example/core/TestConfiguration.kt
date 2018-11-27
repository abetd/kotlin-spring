package com.example.core

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TestConfiguration

fun main(args: Array<String>) {
    SpringApplication.run(TestConfiguration::class.java, *args)
}

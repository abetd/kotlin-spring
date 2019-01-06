package com.example.demo.presentation.controller.sandbox

import org.hibernate.validator.constraints.NotBlank

class HelloForm {
    @NotBlank
    var name: String? = null
}
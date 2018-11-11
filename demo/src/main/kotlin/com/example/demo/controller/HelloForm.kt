package com.example.demo.controller

import org.hibernate.validator.constraints.NotBlank

class HelloForm {
    @NotBlank
    var name: String? = null
}
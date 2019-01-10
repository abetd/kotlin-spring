package com.example.demo.presentation.controller.sandbox

import com.example.core.application.service.sandbox.UserService
import com.example.core.domain.model.sandbox.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("sandbox/hello_world")
class HelloWorldController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping(value = "")
    fun show(model: Model, helloForm: HelloForm) : String {
        model.addAttribute("name", "world!")
        return "sandbox/hello_world"
    }

    @PostMapping(value= "select")
    fun hello(model: Model, helloForm: HelloForm) : String {
        var user: User = userService.select(helloForm.id)
        model.addAttribute("name", user.name)
        return "sandbox/hello_world"
    }
}
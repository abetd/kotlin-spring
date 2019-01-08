package com.example.demo.presentation.controller.sandbox

import com.example.core.application.service.UserService
import com.example.core.domain.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping("sandbox/hello_world")
class HelloWorldController {

    @Autowired
    lateinit var userService: UserService

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun root(model: Model, helloForm: HelloForm) : String {
        model.addAttribute("name", "world!")
        return "sandbox/hello_world"
    }

    @RequestMapping(value= "/hello", method = arrayOf(RequestMethod.POST))
    fun hello(model: Model, helloForm: HelloForm) : String {
        var user: User = userService.select(helloForm.id)
        model.addAttribute("name", user.name)
        return "sandbox/hello_world"
    }
}
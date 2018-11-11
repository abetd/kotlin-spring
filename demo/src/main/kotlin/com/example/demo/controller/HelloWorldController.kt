package com.example.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping("hello_world")
class HelloWorldController {

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun root(model: Model, helloForm: HelloForm) : String {
        model.addAttribute("name", "world!")
        return "hello_world"
    }

    @RequestMapping(value= "/hello", method = arrayOf(RequestMethod.POST))
    fun hello(model: Model, helloForm: HelloForm) : String {
        model.addAttribute("name", helloForm.name)
        return "hello_world"
    }
}
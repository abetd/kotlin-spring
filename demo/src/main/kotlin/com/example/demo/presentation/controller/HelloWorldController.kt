package com.example.demo.presentation.controller

import com.example.core.infrastructure.datasource.UserMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping("hello_world")
class HelloWorldController {

    @Autowired
    lateinit var userMapper: UserMapper

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun root(model: Model, helloForm: HelloForm) : String {
        model.addAttribute("name", "world!")
        return "hello_world"
    }

    // TODO Formでidを指定して検索する。または、テーブルをうまく使う。。
    @RequestMapping(value= "/hello", method = arrayOf(RequestMethod.POST))
    fun hello(model: Model, helloForm: HelloForm) : String {
        // model.addAttribute("name", helloForm.name)
        model.addAttribute("name", userMapper.select(2).name)
        return "hello_world"
    }
}
package com.springy.com.springy.practicespring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldControl {

    @GetMapping("/hello")
    fun helloWorld(): String{
        return "hello world, Spirit lead me"
    }
}
package com.example.springbootactuatorheapdumpcorsdemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RootController {
    val list = ArrayList<Int>()

    @GetMapping("/")
    fun index(): String {
        // forcibly leak memory...
        (0..10000).forEach { i ->
            list.add(i)
        }

        return "OK"
    }
}

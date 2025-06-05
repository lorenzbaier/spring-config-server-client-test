package com.example.demo_secrets_config_client

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DummyController {
    @GetMapping
    fun hello(): String {
        return "HELLO"
    }
}
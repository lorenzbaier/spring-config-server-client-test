package com.example.demo_secrets_config_client

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DummyController(private val config: AnotherConfig) {
    init {
        log.info("got config: {}", config)
    }
    @GetMapping
    fun hello(): String {
        return "HELLO ${config.url}"
    }

    companion object {
        private val log = LoggerFactory.getLogger(DummyController::class.java)
    }
}
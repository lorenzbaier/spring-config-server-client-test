package com.example.demo_secrets_config_client

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DummyController(private val config: AnotherConfig) {
    init {
        log.info("LOOK HERE AT THIS config: {}", config)
    }
    @GetMapping
    fun hello(): String {
        return "HELLO $config"
    }

    companion object {
        private val log = LoggerFactory.getLogger(DummyController::class.java)
    }
}
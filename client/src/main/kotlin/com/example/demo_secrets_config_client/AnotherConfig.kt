package com.example.demo_secrets_config_client

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "another-config")
data class AnotherConfig(
    val value1: String,
    val value2: String,
    val value3: String,
    val value4: String,
)

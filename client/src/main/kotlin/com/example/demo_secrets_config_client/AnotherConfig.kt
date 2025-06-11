package com.example.demo_secrets_config_client

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "another-config")
data class AnotherConfig(val url: String)

package com.example.demo_secrets_config_client

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "my-config-base")
data class BaseConfig(val url: String)

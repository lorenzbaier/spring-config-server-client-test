package com.example.demo_secrets_config_client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@EnableConfigurationProperties(value = [AnotherConfig::class, BaseConfig::class])
@SpringBootApplication
class DemoSecretsConfigClientApplication

fun main(args: Array<String>) {
	runApplication<DemoSecretsConfigClientApplication>(*args)
}

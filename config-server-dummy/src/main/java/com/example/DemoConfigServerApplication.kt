package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class DemoConfigServerApplication

fun main(args: Array<String>) {
    runApplication<DemoConfigServerApplication>(*args)
}
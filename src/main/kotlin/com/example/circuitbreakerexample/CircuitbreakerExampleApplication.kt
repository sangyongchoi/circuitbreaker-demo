package com.example.circuitbreakerexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CircuitbreakerExampleApplication

fun main(args: Array<String>) {
    runApplication<CircuitbreakerExampleApplication>(*args)
}

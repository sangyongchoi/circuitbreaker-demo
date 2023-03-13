package com.example.circuitbreakerexample.demo

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(
    private val demoService: DemoService
) {

    @GetMapping("/demo")
    suspend fun demo(): String {
        return demoService.demo()
    }
}

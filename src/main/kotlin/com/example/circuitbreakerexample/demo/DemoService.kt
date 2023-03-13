package com.example.circuitbreakerexample.demo

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import org.springframework.stereotype.Service

@Service
class DemoService {

    @CircuitBreaker(
        name = "myCircuitBreaker",
        fallbackMethod = "fallback"
    )
    suspend fun demo(): String {
        throw RuntimeException("foo")
    }

    fun fallback(e: Exception): String {
        return "fallback"
    }
}

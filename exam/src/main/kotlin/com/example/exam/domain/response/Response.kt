package com.example.exam.domain.response

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

open class Response(status: HttpStatus, val message: String) {
    init {
        val status = status.value()
    }
}


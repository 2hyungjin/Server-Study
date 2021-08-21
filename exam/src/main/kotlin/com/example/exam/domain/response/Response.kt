package com.example.exam.domain.response

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

class Response(status: HttpStatus, val message: String) {
    var data: Any? = null

    init {
        val status = status.value()
    }

    constructor(status: HttpStatus, message: String, data: Any) : this(status, message) {
        this.data = data
    }
}


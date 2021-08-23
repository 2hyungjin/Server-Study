package com.example.exam.handler

import com.example.exam.domain.response.Response
import javassist.NotFoundException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.client.HttpServerErrorException

@RestControllerAdvice
class ControllerAdvisor {
    @ExceptionHandler(NotFoundException::class)
    fun noUserExceptionHandler(e: NotFoundException): Response {
        return Response(HttpStatus.NOT_FOUND, e.message.toString())
    }

    @ExceptionHandler(HttpServerErrorException::class)
    fun serverErrorExceptionHandler(e: HttpServerErrorException): Response {
        return Response(HttpStatus.INTERNAL_SERVER_ERROR, e.message.toString())
    }

}
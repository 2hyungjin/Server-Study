package com.example.exam.domain.response

import org.springframework.http.HttpStatus

class ResponseWithData<T>(status: HttpStatus, message: String, val data: T) : Response(status,message)
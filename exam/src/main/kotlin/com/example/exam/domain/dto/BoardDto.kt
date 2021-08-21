package com.example.exam.domain.dto

import com.example.exam.domain.entity.User

data class BoardDto(
    val id: Long,
    val contents: String,
    val writer: UserDto
)
package com.example.exam.domain.dto

import com.example.exam.domain.entity.User

data class PostBoardDto(
    val writer: User, val content: String
)
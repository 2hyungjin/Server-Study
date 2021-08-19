package com.example.exam.service

import com.example.exam.domain.dto.PostUserDto
import com.example.exam.domain.dto.UserDto
import com.example.exam.domain.entity.User

interface UserService {
    fun getUsers():List<UserDto>
    fun postUsers(user: PostUserDto)
}
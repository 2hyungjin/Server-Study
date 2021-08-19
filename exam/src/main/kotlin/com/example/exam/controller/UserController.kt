package com.example.exam.controller

import com.example.exam.domain.dto.PostUserDto
import com.example.exam.domain.dto.UserDto
import com.example.exam.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController {
    @Autowired
    lateinit var userService: UserService

    @GetMapping
    fun getUsers(): List<UserDto> {
        return userService.getUsers()
    }

    @PostMapping
    fun postUser(@RequestBody user: PostUserDto){
        userService.postUsers(user)
    }
}
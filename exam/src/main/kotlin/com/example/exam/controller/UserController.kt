package com.example.exam.controller

import com.example.exam.domain.dto.PostUserDto
import com.example.exam.domain.dto.UserDto
import com.example.exam.domain.response.Response
import com.example.exam.domain.response.ResponseWithData
import com.example.exam.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController {
    @Autowired
    lateinit var userService: UserService

    @GetMapping
    fun getUsers(): Response {
        return ResponseWithData(HttpStatus.OK, "", userService.getUsers())
    }

    @PostMapping
    fun postUser(@RequestBody user: PostUserDto): Response {
        userService.postUsers(user)
        return Response(HttpStatus.OK, "")
    }

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long): Response {
        return ResponseWithData(HttpStatus.OK, "", userService.getUser(id))
    }
}
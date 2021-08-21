package com.example.exam.service

import com.example.exam.domain.dto.BoardDto
import com.example.exam.domain.dto.PostUserDto
import com.example.exam.domain.dto.UserDto
import com.example.exam.domain.entity.User
import com.example.exam.domain.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
    @Autowired
    lateinit var userRepository: UserRepository

    override fun getUsers(): List<UserDto> {
        val users = userRepository.findAll()
        val userList = arrayListOf<UserDto>()
        users.forEach { user ->
            userList.add(UserDto(user.id!!, user.name))
        }
        return userList

    }

    override fun postUsers(userDto: PostUserDto) {
        val user: User = User(userDto.name)
        userRepository.save(user)
    }
}
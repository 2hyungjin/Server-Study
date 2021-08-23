package com.example.exam.service

import com.example.exam.domain.dto.BoardDto
import com.example.exam.domain.dto.PostUserDto
import com.example.exam.domain.dto.UserDto
import com.example.exam.domain.entity.User
import com.example.exam.domain.repository.UserRepository
import javassist.NotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.client.HttpServerErrorException

@Service
class UserServiceImpl : UserService {
    @Autowired
    lateinit var userRepository: UserRepository

    override fun getUsers(): List<UserDto> {
        val users = userRepository.findAll()
        val userList = arrayListOf<UserDto>()
        try {
            users.forEach { user ->
                userList.add(UserDto(user.id!!, user.name))
            }
            if (userList.isEmpty()) {
                throw NotFoundException("No User exists.")
            }
        } catch (e: Exception) {
            throw HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR)
        }
        return userList


    }

    override fun postUsers(userDto: PostUserDto) {
        val user: User = User(userDto.name)
        userRepository.save(user)
    }

    override fun getUser(id: Long): UserDto {
        var user: User?
        try {
            user = userRepository.findById(id).get()
            if (user == null) throw NotFoundException("No user id is $id")
        } catch (e: Exception) {
            throw HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR)
        }
        return UserDto(user.id!!, user.name)
    }


}
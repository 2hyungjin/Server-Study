package com.example.exam.domain.repository

import com.example.exam.domain.dto.UserDto
import com.example.exam.domain.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>{
    fun findByName(name:String):User?
}
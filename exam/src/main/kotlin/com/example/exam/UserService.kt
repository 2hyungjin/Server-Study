package com.example.exam

interface UserService {
    fun getUsers():List<User>
    fun postUsers(user: User)
}
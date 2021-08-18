package service

import com.example.demo.entity.User

interface UserService {
    fun create(user: User): String
    fun update(user: User)
    fun delete(id: String)
    fun retrieve(id: String): User
    fun retrieveAll(): List<User>
}
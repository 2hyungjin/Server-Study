package com.example.demo.entity

import lombok.ToString
import java.util.*

@ToString
class User(
    var id: String,
    val name: String?,
    val email: String?
) {
    init {
        id = UUID.randomUUID().toString()
    }

    constructor() : this("", null, null)
    constructor(name: String, email: String) : this("", name, email)

    open fun sample() = User("Lee", "jinstonlee@naver.com")
}

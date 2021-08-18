package com.example.exam

import org.hibernate.annotations.GeneratorType
import javax.persistence.*

@Entity
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    @Column
    var name: String=""
}
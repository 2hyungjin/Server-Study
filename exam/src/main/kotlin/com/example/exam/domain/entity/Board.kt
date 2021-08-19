package com.example.exam.domain.entity

import javax.persistence.*

@Entity
data class Board(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @ManyToOne
    @JoinColumn(name = "user_id")
    val writer: User?
) {
    constructor(writer: User) : this(null, writer)
}

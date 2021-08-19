package com.example.exam.domain.entity

import javax.persistence.*

@Entity
data class Board(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Column
    val content: String,

    @ManyToOne
    @JoinColumn(name = "user_id")
    val writer: User?
) {
    constructor(content: String, writer: User) : this(null, content, writer)
}

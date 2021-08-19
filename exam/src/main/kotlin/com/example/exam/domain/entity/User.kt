package com.example.exam.domain.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import lombok.Getter
import javax.persistence.*

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = 0,

    @Column
    var name: String = "",

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    var boards: List<Board>
) {
    constructor(name: String) : this(null, name, emptyList())
}
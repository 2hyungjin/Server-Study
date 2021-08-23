package com.example.exam.domain.repository

import com.example.exam.domain.entity.Board
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository : JpaRepository<Board, Long> {
    fun findByWriterId(writer_id: Long): List<Board>

}
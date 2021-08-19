package com.example.exam.service

import com.example.exam.domain.repository.BoardRepository
import org.springframework.beans.factory.annotation.Autowired

class BoardServiceImpl : BoardService {
    @Autowired
    lateinit var boardRepository: BoardRepository
    override fun getBoards() {
        boardRepository.findAll()
    }

    override fun postBoard() {
        TODO("Not yet implemented")
    }

    override fun getBoardById() {
        TODO("Not yet implemented")
    }
}
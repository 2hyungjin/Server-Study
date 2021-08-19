package com.example.exam.service

import com.example.exam.domain.dto.BoardDto
import com.example.exam.domain.dto.PostBoardDto
import org.springframework.stereotype.Service


interface BoardService {
    fun getBoards(): List<BoardDto>
    fun postBoard(board: PostBoardDto)
    fun getBoardById(id:Long): BoardDto
}
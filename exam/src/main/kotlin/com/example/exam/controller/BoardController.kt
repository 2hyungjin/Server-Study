package com.example.exam.controller

import com.example.exam.domain.dto.BoardDto
import com.example.exam.domain.dto.PostBoardDto
import com.example.exam.service.BoardService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/boards")
class BoardController {

    @Autowired
    lateinit var boardService: BoardService

    @GetMapping
    fun getBoards(): List<BoardDto> {
        return boardService.getBoards()
    }

    @PostMapping
    fun postBoards(@RequestBody board: PostBoardDto) {
        return boardService.postBoard(board)
    }

    @GetMapping("{id}")
    fun getBoardById(@PathVariable id: Long): BoardDto {
        return boardService.getBoardById(id)
    }


}
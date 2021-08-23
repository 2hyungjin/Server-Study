package com.example.exam.controller

import com.example.exam.domain.dto.BoardDto
import com.example.exam.domain.dto.PostBoardDto
import com.example.exam.domain.response.Response
import com.example.exam.domain.response.ResponseWithData
import com.example.exam.service.BoardService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/boards")
class BoardController {

    @Autowired
    lateinit var boardService: BoardService

    @GetMapping
    fun getBoards(): Response {
        return ResponseWithData(HttpStatus.OK,"",boardService.getBoards())
    }

    @PostMapping
    fun postBoards(@RequestBody board: PostBoardDto): Response {
        boardService.postBoard(board)
        return Response(HttpStatus.OK,"")
    }

    @GetMapping("{id}")
    fun getBoardById(@PathVariable id: Long): Response {
        return ResponseWithData(HttpStatus.OK,"",boardService.getBoardById(id))
    }


}
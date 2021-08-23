package com.example.exam.service

import com.example.exam.domain.dto.BoardDto
import com.example.exam.domain.dto.PostBoardDto
import com.example.exam.domain.dto.UserDto
import com.example.exam.domain.entity.Board
import com.example.exam.domain.repository.BoardRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.client.HttpServerErrorException
import java.util.*

@Service
class BoardServiceImpl : BoardService {
    @Autowired
    lateinit var boardRepository: BoardRepository

    override fun getBoards(): List<BoardDto> {
        val boards = boardRepository.findAll()
        val boardList = arrayListOf<BoardDto>()
        throw HttpServerErrorException(HttpStatus.OK, "asedsd")
        for (i in boards) boardList.add(BoardDto(i.id!!, i.content, UserDto(i.writer?.id!!,i.writer.name)))
        return boardList
    }

    override fun postBoard(board: PostBoardDto) {
        boardRepository.save(Board(content = board.content, writer = board.writer))
    }

    override fun getBoardById(id: Long): BoardDto {
        val board: Board = boardRepository.findById(id).get()
        return BoardDto(board.id!!, board.content,UserDto(board.writer?.id!!,board.writer.name))
    }


}
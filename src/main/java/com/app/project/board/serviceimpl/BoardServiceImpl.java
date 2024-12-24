package com.app.project.board.serviceimpl;

import com.app.project.board.dao.BoardMapper;
import com.app.project.board.service.BoardService;
import com.app.project.board.service.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Autowired
    public BoardServiceImpl(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<BoardVO> boardList(){
        return boardMapper.selectBoardList();
    }
}

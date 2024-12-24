package com.app.project.board.dao;

import com.app.project.board.service.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardVO> selectBoardList();
}

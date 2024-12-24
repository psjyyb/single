package com.app.project.board.controller;

import com.app.project.board.serviceimpl.BoardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value="/")
public class BoardController {

    private final BoardServiceImpl boardServiceImpl;

    @Autowired
    public BoardController (BoardServiceImpl boardServiceImpl) {
        this.boardServiceImpl = boardServiceImpl;
    }

    @RequestMapping(value = "/board",method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("boardList", boardServiceImpl.boardList());
      return "board/list";
    };
}


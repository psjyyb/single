package com.app.project.board.service;

import java.util.Date;

public class BoardVO {
    private int boardNo;
    private String boardTitle;
    private String boardContent;
    private Date boardDt;

    public int getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public Date getBoardDt() {
        return boardDt;
    }

    public void setBoardDt(Date boardDt) {
        this.boardDt = boardDt;
    }


}

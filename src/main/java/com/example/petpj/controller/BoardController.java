package com.example.petpj.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.petpj.model.Board;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
    @RequestMapping("/getBoardList")
    public String getBoardList(Model model) {
        //List 타입으로 Board객체를 넣는 boardList 변수명 선언
        // = (대입연산자)로 heap메모리에 ArrayList 타입으로 할당
        //List는 ArrayList의 부모클래스 이다
        List<Board> boardList = new ArrayList<Board>();

        for(int i = 1; i <= 10; i++){
            //Board 클래스로 board인스턴스 생성
            Board board = new Board();
            //롬복으로 자동 생성된 set 메서드로 데이터 입력
            board.setSeq(new Long(i));
            board.setTitle("게시판 프로그램 테스트");
            board.setWriter("도우너");
            board.setContent("게시판 프로그램 테스트입니다...");
            board.setCreateDate(new Date());
            board.setCnt(0L);
            //boardList배열에 board객체 넣기 (for문 10번 도니까 board객체 10개 넣기)
            boardList.add(board);
        }
        model.addAttribute("boardList", boardList);
        //viewResolver 가 같은 name의 값을 찾아준다
        return "getBoardList";
    }
    @GetMapping("insertBoard")
    public String insertBoardVieW(){
        return "insertBoard";
    }

//    @PostMapping("/insertBoard")
//    public String insertBoard(Board board) {
//        boardService.insertBoard(board);
//        return "redirect:getBoardList";
//    }
}

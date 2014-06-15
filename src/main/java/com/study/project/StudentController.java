package com.study.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class StudentController {
	//메인
	@RequestMapping(value = "/main")
	public String main(String menu) {

		return "student/main";
	}
	//게시판
	@RequestMapping(value = "/board")
	public String board(String menu) {

		return "student/board";
	}
	//게시판 내용
	@RequestMapping(value = "/board_detail")
	public String board_detail(String menu) {

		return "student/board_detail";
	}
	//게시판 수정
	@RequestMapping(value = "/board_update")
	public String board_update(String menu) {

		return "student/board_update";
	}
	//게시판 글쓰기
	@RequestMapping(value = "/board_write")
	public String board_write(String menu) {

		return "student/board_write";
	}
	//내답안
	@RequestMapping(value = "/my_paper")
	public String my_paper(String menu) {

		return "student/my_pater";
	}
	
	@RequestMapping(value = "/notice")
	public String notice(String menu) {

		return "student/notice";
	}

	@RequestMapping(value = "/notice_detail")
	public String notice_detail(String menu) {

		return "student/notice_detail";
	}

	@RequestMapping(value = "/score")
	public String score(String menu) {

		return "student/score";
	}

	@RequestMapping(value = "/test_graph")
	public String test_graph(String menu) {

		return "student/test_graph";
	}

	@RequestMapping(value = "/test_index")
	public String test_index(String menu) {

		return "student/test_index";
	}

	@RequestMapping(value = "/test_result")
	public String test_result(String menu) {

		return "student/test_result";
	}

	@RequestMapping(value = "/test_start")
	public String test_start(String menu) {

		return "student/test_start";
	}

	@RequestMapping(value = "/test_update")
	public String test_update(String menu) {

		return "student/test_update";
	}
}


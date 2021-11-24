package com.mycompany.myapp09.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.myapp09.model.service.MemberService;

@Controller
public class MemberController {
//	INSERT INTO MEMBER VALUES('user1', 'pass1', '홍길동', DEFAULT);
//	INSERT INTO MEMBER VALUES('user2', 'pass2', '고길동', DEFAULT);
	@Autowired
	private MemberService memberservice;
	
	
	
	
	
	@PostMapping("idCheck")
	@ResponseBody
	public String idCheck(@RequestParam("id") String id) {
		System.out.println("id : " + id);
		
		String resultStr = "";
		int result = 0;
		try {
			result = memberservice.idCheck(id);
		} catch (Exception e) {
			e.printStackTrace();
			resultStr = "ajax 통신 실패";
		}
		if (result == 1) {
			resultStr = "false";
		} else {
			resultStr = "true";
		}
		return resultStr;
	}
}

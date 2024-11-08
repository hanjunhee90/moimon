package com.future.my.member.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.future.my.member.service.MemberService;
import com.future.my.member.vo.InterestVO;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memService;
	
	@GetMapping("/addr")
	public String addr() {
		return "members/memjuso";
	}

	@GetMapping("/interest")
	public String interest(Model model) {
		ArrayList<InterestVO> interestList = memService.getInterestList();
		model.addAttribute("interestList",interestList );
		System.out.println(interestList);
		return "members/interest";
	}

}

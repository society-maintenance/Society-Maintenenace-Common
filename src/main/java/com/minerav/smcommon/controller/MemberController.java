package com.minerav.smcommon.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.minerav.smcommon.service.MemberService;
import com.minerav.smlib.domain.Member;

@RestController
@RequestMapping(path="/society/common/")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	
	
	@RequestMapping(path="members",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Member> getMembers(){
		return memberService.getMembers();
	}
}

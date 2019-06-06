package com.minerav.smcommon.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minerav.smcommon.service.MemberService;
import com.minerav.smlib.domain.Member;
import com.minerav.smlib.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService{

	private static final Logger log = LoggerFactory.getLogger(MemberService.class);

	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public List<Member> getMembers() {
		log.info("Get all members ");
		return StreamSupport.stream(memberRepository.findAll().spliterator(),false).collect(Collectors.toList());
	}
	
}

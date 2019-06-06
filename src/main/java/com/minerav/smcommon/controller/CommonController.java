package com.minerav.smcommon.controller;


import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.minerav.smcommon.domain.CommonContact;
import com.minerav.smcommon.service.CommonService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController()
@RequestMapping(path="/society/common/")
public class CommonController {

	private static final Logger log = LoggerFactory.getLogger(CommonController.class);

	@Autowired
	private CommonService commonService;
	
	@RequestMapping(method=RequestMethod.GET, name="Get Useful Contact", path="contact",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Set<CommonContact>> getUsefulContact(){
		log.info("Inside method to retrieve Useful Contact");
		Set<CommonContact> usefulContacts = commonService.getUsefulContact();
		return new ResponseEntity<Set<CommonContact>>(usefulContacts, usefulContacts!=null ? 
				HttpStatus.OK : HttpStatus.NO_CONTENT);
	}
}

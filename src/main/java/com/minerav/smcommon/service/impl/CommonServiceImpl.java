package com.minerav.smcommon.service.impl;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minerav.smcommon.domain.CommonContact;
import com.minerav.smcommon.repository.CommonContactRepository;
import com.minerav.smcommon.service.CommonService;

@Service
public class CommonServiceImpl implements CommonService{

	@Autowired
	private CommonContactRepository commonContactRepo;
	
	private static final Logger log = LoggerFactory.getLogger(CommonService.class);
	
	@Override
	public Set<CommonContact> getUsefulContact() {
		log.info("Get Useful Contact Method  - started");
		Set<CommonContact> response = StreamSupport.stream
				(commonContactRepo.findAll().spliterator(), false).collect(Collectors.toSet());
		log.info("Get Useful Contact Method  - Ended "   +"  " + response);
		return response;
				
	}

}

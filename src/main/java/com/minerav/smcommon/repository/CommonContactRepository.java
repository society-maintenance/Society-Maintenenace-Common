package com.minerav.smcommon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minerav.smcommon.domain.CommonContact;

@Repository
public interface CommonContactRepository  extends JpaRepository<CommonContact, Integer>{

	
}

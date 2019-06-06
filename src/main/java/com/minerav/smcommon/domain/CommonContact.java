package com.minerav.smcommon.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @NoArgsConstructor @ToString
@Table(name="usefulcontact")
@Entity
public class CommonContact {

	@Column(name="contactid")
	@Id
	private Integer contactId;
	@Column(name="contactname")
	private String contactName;
	@Column(name="domain")
	private String domainExpertise;
	@Column(name="contactno")
	private String contactNo;
	@Column(name="additionalinfo")
	private String additionalInfo;
	
	
}

package com.assess.eAssessment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidate {
	@Id
	private int candiate_id;

	// FK of user
	private int user_id;

	// FK of Assessment
	private int assessment_id;
	private String firstName;
	private String lastName;
	private String email;
	private Date timestamp;

}

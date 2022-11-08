package com.assess.eAssessment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Assessment {
	@Id
	private int assessment_id;

	// Foreign key from User.class
	private int user_id;
	private String assessment_name;
	private String job_role;
	private Date timestamp;
}

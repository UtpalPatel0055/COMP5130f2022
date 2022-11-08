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

	public Assessment() {

	}

	public Assessment(int assessment_id, int user_id, String assessment_name, String job_role, Date timestamp) {

		this.assessment_id = assessment_id;
		this.user_id = user_id;
		this.assessment_name = assessment_name;
		this.job_role = job_role;
		this.timestamp = timestamp;
	}

	public int getAssessment_id() {
		return assessment_id;
	}

	public void setAssessment_id(int assessment_id) {
		this.assessment_id = assessment_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getAssessment_name() {
		return assessment_name;
	}

	public void setAssessment_name(String assessment_name) {
		this.assessment_name = assessment_name;
	}

	public String getJob_role() {
		return job_role;
	}

	public void setJob_role(String job_role) {
		this.job_role = job_role;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}

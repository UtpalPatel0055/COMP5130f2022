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

	public Candidate() {

	}

	public Candidate(int candiate_id, int user_id, int assessment_id, String firstName, String lastName, String email,
			Date timestamp) {

		this.candiate_id = candiate_id;
		this.user_id = user_id;
		this.assessment_id = assessment_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.timestamp = timestamp;
	}

	public int getCandiate_id() {
		return candiate_id;
	}

	public void setCandiate_id(int candiate_id) {
		this.candiate_id = candiate_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getAssessment_id() {
		return assessment_id;
	}

	public void setAssessment_id(int assessment_id) {
		this.assessment_id = assessment_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}

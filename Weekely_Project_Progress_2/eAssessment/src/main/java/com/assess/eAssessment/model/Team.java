package com.assess.eAssessment.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	private int member_id;
	private String role;

	// FK from user
	private int user_id;

	private String email;
	private String password;
	private boolean is_verified;
	private String lname;
	private String fname;
	private BigInteger mobile;
	private Date timestamp;
}

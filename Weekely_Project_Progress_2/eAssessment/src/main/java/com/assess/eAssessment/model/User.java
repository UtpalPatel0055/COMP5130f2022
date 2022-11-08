package com.assess.eAssessment.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int user_id;
	private String email;
	private String password;
	private boolean is_verified;
	private String role;
	private String lname;
	private String fname;
	private BigInteger mobile;
	private String company_name;
	private String job_title;
	private int no_hires_per_year;
	private String country;
	private String website;
	private String file_uploaded_name;
	private Date created_at;
	private Date updated_at;
}

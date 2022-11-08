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

	public Team() {

	}

	public Team(int member_id, String role, int user_id, String email, String password, boolean is_verified,
			String lname, String fname, BigInteger mobile, Date timestamp) {

		this.member_id = member_id;
		this.role = role;
		this.user_id = user_id;
		this.email = email;
		this.password = password;
		this.is_verified = is_verified;
		this.lname = lname;
		this.fname = fname;
		this.mobile = mobile;
		this.timestamp = timestamp;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isIs_verified() {
		return is_verified;
	}

	public void setIs_verified(boolean is_verified) {
		this.is_verified = is_verified;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public BigInteger getMobile() {
		return mobile;
	}

	public void setMobile(BigInteger mobile) {
		this.mobile = mobile;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}

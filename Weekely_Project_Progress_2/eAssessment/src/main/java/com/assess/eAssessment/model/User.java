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

	public User() {

	}

	public User(int user_id, String email, String password, boolean is_verified, String role, String lname,
			String fname, BigInteger mobile, String company_name, String job_title, int no_hires_per_year,
			String country, String website, String file_uploaded_name, Date created_at, Date updated_at) {
		this.user_id = user_id;
		this.email = email;
		this.password = password;
		this.is_verified = is_verified;
		this.role = role;
		this.lname = lname;
		this.fname = fname;
		this.mobile = mobile;
		this.company_name = company_name;
		this.job_title = job_title;
		this.no_hires_per_year = no_hires_per_year;
		this.country = country;
		this.website = website;
		this.file_uploaded_name = file_uploaded_name;
		this.created_at = created_at;
		this.updated_at = updated_at;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public int getNo_hires_per_year() {
		return no_hires_per_year;
	}

	public void setNo_hires_per_year(int no_hires_per_year) {
		this.no_hires_per_year = no_hires_per_year;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFile_uploaded_name() {
		return file_uploaded_name;
	}

	public void setFile_uploaded_name(String file_uploaded_name) {
		this.file_uploaded_name = file_uploaded_name;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

}

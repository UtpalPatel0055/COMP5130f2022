package com.assess.eAssessment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Questions {
	@Id
	private String id;

	// Fk of User
	private int user_id;

	// Fk of Assessment
	private int assessment_id;
	private String OrderBy;
	private String name;
	private String question_type;
	private String time;
	private String question;
	private String option_1;
	private String option_2;
	private String option_3;
	private String option_4;
	private String correct_option;
	private String selected_language;
	private String isShuffle;
	private Date timestamp;

	public Questions() {

	}

	public Questions(String id, int user_id, int assessment_id, String orderBy, String name, String question_type,
			String time, String question, String option_1, String option_2, String option_3, String option_4,
			String correct_option, String selected_language, String isShuffle, Date timestamp) {

		this.id = id;
		this.user_id = user_id;
		this.assessment_id = assessment_id;
		OrderBy = orderBy;
		this.name = name;
		this.question_type = question_type;
		this.time = time;
		this.question = question;
		this.option_1 = option_1;
		this.option_2 = option_2;
		this.option_3 = option_3;
		this.option_4 = option_4;
		this.correct_option = correct_option;
		this.selected_language = selected_language;
		this.isShuffle = isShuffle;
		this.timestamp = timestamp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getOrderBy() {
		return OrderBy;
	}

	public void setOrderBy(String orderBy) {
		OrderBy = orderBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuestion_type() {
		return question_type;
	}

	public void setQuestion_type(String question_type) {
		this.question_type = question_type;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption_1() {
		return option_1;
	}

	public void setOption_1(String option_1) {
		this.option_1 = option_1;
	}

	public String getOption_2() {
		return option_2;
	}

	public void setOption_2(String option_2) {
		this.option_2 = option_2;
	}

	public String getOption_3() {
		return option_3;
	}

	public void setOption_3(String option_3) {
		this.option_3 = option_3;
	}

	public String getOption_4() {
		return option_4;
	}

	public void setOption_4(String option_4) {
		this.option_4 = option_4;
	}

	public String getCorrect_option() {
		return correct_option;
	}

	public void setCorrect_option(String correct_option) {
		this.correct_option = correct_option;
	}

	public String getSelected_language() {
		return selected_language;
	}

	public void setSelected_language(String selected_language) {
		this.selected_language = selected_language;
	}

	public String getIsShuffle() {
		return isShuffle;
	}

	public void setIsShuffle(String isShuffle) {
		this.isShuffle = isShuffle;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}

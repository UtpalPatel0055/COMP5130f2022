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
}

package org.model.acr;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ACA_RECORD")
public class academicRecord {
	@Column(name="SUBJECT_CODE",nullable=false)
	private String subcode;
	@Column(name="YEAR")
	private int year;
	@Column(name="DATE")
	private String date;
	@Column(name="GRADE")
	private float grade;
	@Column(name="SUBCODE")
	public String getSubcode() {
		return subcode;
	}
	public void setSubcode(String subcode) {
		this.subcode = subcode;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	public academicRecord() {
		super();
		
	}
	public academicRecord(String subcode, int year, String date, float grade) {
		super();
		this.subcode = subcode;
		this.year = year;
		this.date = date;
		this.grade = grade;
	}
	
}

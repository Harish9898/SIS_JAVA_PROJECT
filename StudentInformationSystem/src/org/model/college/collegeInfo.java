package org.model.college;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COLLEGEINFO")
public class collegeInfo {
	private int cSno;
	private 	String collegeName;
	private String startYear;
	private String endYear;
	private String studNumber;
	private int courseId;
	private  String degreeId;
	@Id
	@Column(name="COLLEGECODE",nullable=false)
	public int getcSno() {
		return cSno;
	}
	public void setcSno(int cSno) {
		this.cSno = cSno;
	}
	@Column(name="COLLEGENAME",nullable=false)
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Column(name="STARTYEAR",nullable=false)
	public String getStartYear() {
		return startYear;
	}
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}
	@Column(name="ENDYEAR",nullable=false)
	public String getEndYear() {
		return endYear;
	}
	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}
	@Column(name="STUDENTNUMBER",nullable=false)
	public String getStudNumber() {
		return studNumber;
	}
	public void setStudNumber(String studNumber) {
		this.studNumber = studNumber;
	}
	@Column(name="COURSEID",nullable=false)
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	@Column(name="DEGREEID",nullable=false)
	public String getDegreeId() {
		return degreeId;
	}
	public void setDegreeId(String degreeId) {
		this.degreeId = degreeId;
	}
	
}

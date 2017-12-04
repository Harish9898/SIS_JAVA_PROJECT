package org.model.college;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="SECTION")
public class section {

	private String courseNumber;
	private String sectionName;
	private String code;
	private String instructor;
	private String semester;
	private String year;
	private String course;
	@Column(name="COURSENUMBER",nullable=false)
	public String getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	@Column(name="SECTIONNAME",nullable=false)
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	@Column(name="CODE",nullable=false)
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Column(name="INSTRUTOR",nullable=false)
	public String getInstructor() {
		
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	@Column(name="SEMESTER",nullable=false)
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	@Column(name="YEAR",nullable=false)
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Column(name="COURSE",nullable=false)
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public section(String courseNumber, String sectionName, String code, String instructor, String semester,
			String year, String course) {
		super();
		this.courseNumber = courseNumber;
		this.sectionName = sectionName;
		this.code = code;
		this.instructor = instructor;
		this.semester = semester;
		this.year = year;
		this.course = course;
	}
	
	
	
	
}

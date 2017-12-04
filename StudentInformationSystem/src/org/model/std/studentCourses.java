package org.model.std;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTCOURSES")
public class studentCourses {
	private int courseId;
	private String courseName;
	private String grade;
	private int hours;
	private String studentNumber;
	private String courseNumber;
	private String offeringDepartment;
	@Column(name="COURSEID",nullable=false)
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	@Column(name="COURSENAME",nullable=false)
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Column(name="GRADE",nullable=false)
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Column(name="HOURS",nullable=false)
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	@Column(name="STUDENTNUMBER",nullable=false)
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getCourseNumber() {
		return courseNumber;
	}
	@Column(name="COURSENUMBER",nullable=false)
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	@Column(name="OFFERINGDEPARTMENT",nullable=false)
	public String getOfferingDepartment() {
		return offeringDepartment;
	}
	public void setOfferingDepartment(String offeringDepartment) {
		this.offeringDepartment = offeringDepartment;
	}
	public studentCourses(int courseId, String courseName, String grade, int hours, String studentNumber,
			String courseNumber, String offeringDepartment) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.grade = grade;
		this.hours = hours;
		this.studentNumber = studentNumber;
		this.courseNumber = courseNumber;
		this.offeringDepartment = offeringDepartment;
	}
	
}

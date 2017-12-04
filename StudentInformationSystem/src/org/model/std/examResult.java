package org.model.std;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EXAMRESULT")
public class examResult {
private String examId;
private String studentNumber;
private String courseNumber;
private String marks;
@Column(name="EXAMID",nullable=false)
public String getExamId() {
	return examId;
}
public void setExamId(String examId) {
	this.examId = examId;
}
@Column(name="STUDENTNUMBER",nullable=false)
public String getStudentNumber() {
	return studentNumber;
}
public void setStudentNumber(String studentNumber) {
	this.studentNumber = studentNumber;
}
@Column(name="COURSENUMBER",nullable=false)
public String getCourseNumber() {
	return courseNumber;
}
public void setCourseNumber(String courseNumber) {
	this.courseNumber = courseNumber;
}

@Column(name="MARKS",nullable=false)
public String getMarks() {
	return marks;
}
public void setMarks(String marks) {
	this.marks = marks;
}
public examResult(String examId, String studentNumber, String courseNumber, String marks) {
	super();
	this.examId = examId;
	this.studentNumber = studentNumber;
	this.courseNumber = courseNumber;
	this.marks = marks;
}

}

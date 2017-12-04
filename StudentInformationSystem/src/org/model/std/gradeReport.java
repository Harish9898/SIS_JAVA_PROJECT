package org.model.std;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="GRADEREPORT")
public class gradeReport {
private String sectionName;
private String letterGrade;
private String numericGrade;
private String studentNumber;
@Column(name="SECTIONNUMBER",nullable=false)
public String getSectionName() {
	return sectionName;
}
public void setSectionName(String sectionName) {
	this.sectionName = sectionName;
}
@Column(name="LETTERGRADE",nullable=false)
public String getLetterGrade() {
	return letterGrade;
}
public void setLetterGrade(String letterGrade) {
	this.letterGrade = letterGrade;
}
@Column(name="NUMERICGRADE",nullable=false)
public String getNumericGrade() {
	return numericGrade;
}
public void setNumericGrade(String numericGrade) {
	this.numericGrade = numericGrade;
}
@Column(name="STUDENTNUMBER",nullable=false)
public String getStudentNumber() {
	return studentNumber;
}
public void setStudentNumber(String studentNumber) {
	this.studentNumber = studentNumber;
}
public gradeReport(String sectionName, String letterGrade, String numericGrade, String studentNumber) {
	super();
	this.sectionName = sectionName;
	this.letterGrade = letterGrade;
	this.numericGrade = numericGrade;
	this.studentNumber = studentNumber;
}


}

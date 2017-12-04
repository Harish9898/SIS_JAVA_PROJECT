package org.model.std;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTDEPARTMENT")
public class studentDepartment {

private	String studentNumber;
private	int totalSub;
private	String code;
@Column(name="STUDENTNUMBER",nullable=false)
public String getStudentNumber() {
	return studentNumber;
}
public void setStudentNumber(String studentNumber) {
	this.studentNumber = studentNumber;
}
@Column(name="TOTALSUBJECTS",nullable=false)
public int getTotalSub() {
	return totalSub;
}
public void setTotalSub(int totalSub) {
	this.totalSub = totalSub;
}
@Column(name="CODE",nullable=false)
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public studentDepartment(String studentNumber, int totalSub, String code) {
	super();
	this.studentNumber = studentNumber;
	this.totalSub = totalSub;
	this.code = code;
}
}

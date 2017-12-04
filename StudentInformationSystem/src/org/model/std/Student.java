package org.model.std;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
	
private String studentNumber;
private String password;
private String DOB;
private String email;
private String firstName;
private String lastName;
private String sex;
private String currentAddress;
private String permanentAddress;
private boolean status;
private long currentPhone;
private long permanentPhone;
private String DOJ;
@Id
@Column(name="STUDENTNUMBER",nullable=false)
public String getStudentNumber() {
	return studentNumber;
}
public void setStudentNumber(String studentNumber) {
	this.studentNumber = studentNumber;
}
/*@Column(name="PASSWORD",nullable=false)
public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
@Column(name="DOB",nullable=false)
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}
@Column(name="EMAIL",nullable=false)
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Column(name="FIRSTNAME",nullable=false)
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
@Column(name="LASTNAME",nullable=false)
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Column(name="SEX",nullable=false)
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
@Column(name="CURRENTADDRESS",nullable=false)
public String getCurrentAddress() {
	return currentAddress;
}
public void setCurrentAddress(String currentAddress) {
	this.currentAddress = currentAddress;
}
@Column(name="PERMANENTADDRESS",nullable=false)
public String getPermanentAddress() {
	return permanentAddress;
}
public void setPermanentAddress(String permanentAddress) {
	this.permanentAddress = permanentAddress;
}
@Column(name="STATUS",nullable=false)
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
@Column(name="CURRENTPHONE",nullable=false)
public long getCurrentPhone() {
	return currentPhone;
}
public void setCurrentPhone(long currentPhone) {
	this.currentPhone = currentPhone;
}
@Column(name="PERMANENTPHONE",nullable=false)
public long getPermanentPhone() {
	return permanentPhone;
}
public void setPermanentPhone(long permanentPhone) {
	this.permanentPhone = permanentPhone;
}
@Column(name="DOJ",nullable=false)
public String getDOJ() {
	return DOJ;
}
public void setDOJ(String dOJ) {
	DOJ = dOJ;
}

*/



	
	
}


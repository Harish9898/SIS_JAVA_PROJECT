package org.model.std;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ATTENDANCE")
public class attendance {
	@Column(name="TOTALATTENDANCE",nullable=false)
	private int totalAttendance;
	@Column(name="ELIGIBILITY",nullable=false)
	private boolean eligibilty;
	@Column(name="STUDENTNUMBER",nullable=false)
	private String studentNumber;
	@Column(name="REMARK",nullable=false)
	private String remark;
	@Column(name="STATUS")
	private String status;
	
	public int getTotalAttendance() {
		return totalAttendance;
	}
	public void setTotalAttendance(int totalAttendance) {
		this.totalAttendance = totalAttendance;
	}
	public boolean isEligibilty() {
		return eligibilty;
	}
	public void setEligibilty(boolean eligibilty) {
		this.eligibilty = eligibilty;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}

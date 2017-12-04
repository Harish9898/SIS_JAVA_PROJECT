package org.model.college;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEACHER")
public class Teacher {
	@Id
	@Column(name="TEACHERID",nullable=false)
	private int teacherId;
	@Column(name="EMAIL",nullable=false)
	private String tEmail;
	@Column(name="TFIRSTNAME",nullable=false)
	private String tfname;
	@Column(name="TLASTNAME",nullable=false)
	private String tlname;

	@Column(name="TADDRESS",nullable=false)
	private String address;

	@Column(name="TPHONENUM",nullable=false)
	private String phno;

	@Column(name="TDOB",nullable=false)
	private String dob;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String gettEmail() {
		return tEmail;
	}
	public void settEmail(String tEmail) {
		this.tEmail = tEmail;
	}
	public String getTfname() {
		return tfname;
	}
	public void setTfname(String tfname) {
		this.tfname = tfname;
	}
	public String getTlname() {
		return tlname;
	}
	public void setTlname(String tlname) {
		this.tlname = tlname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}

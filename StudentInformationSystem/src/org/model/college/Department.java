package org.model.college;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="DEPARTMENT")
public class Department {
	
	private String code;
	private String name;
	private int subjects;
	@Id
	@Column(name="DEPCODE")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Column(name="DEPNAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="SUBJECTS")
	public int getSubjects() {
		return subjects;
	}
	public void setSubjects(int subjects) {
		this.subjects = subjects;
	}
	public Department(String code, String name, int subjects) {
		super();
		this.code = code;
		this.name = name;
		this.subjects = subjects;
	}
	
}

package org.model.college;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="DEPARTMENT")
public class exam {
private String examId;
private String examType;
private String startDate;
@Id
@Column(name="EXAMID",nullable=false)
public String getExamId() {
	return examId;
}
public void setExamId(String examId) {
	this.examId = examId;
}
@Column(name="EXAMTYPE",nullable=false)
public String getExamType() {
	return examType;
}
public void setExamType(String examType) {
	this.examType = examType;
}
@Column(name="STARTDATE",nullable=false)
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public exam(String examId, String examType, String startDate) {
	super();
	this.examId = examId;
	this.examType = examType;
	this.startDate = startDate;
}

}

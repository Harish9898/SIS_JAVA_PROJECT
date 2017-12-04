package org.model.college;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEGREE")
public class degree {
private String text;
private int duration;
private int degreeId;
@Column(name="DESCRIPTION")
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
@Column(name="DURATION")
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
@Id
@Column(name="DEGREEID")
public int getDegreeId() {
	return degreeId;
}
public void setDegreeId(int degreeId) {
	this.degreeId = degreeId;
}

}

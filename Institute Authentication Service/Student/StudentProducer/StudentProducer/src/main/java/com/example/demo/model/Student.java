package com.example.demo.model;
import jakarta.persistence.*;
@Entity
@Table(name="StudentMicro")
public class Student {
	@Id
	@Column(name="Studentid")
	private int studentid;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Column(name="Studentname")
	private String studentname;
	@Column(name="score")
	private double score;

}

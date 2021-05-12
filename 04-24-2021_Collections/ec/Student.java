package com.ojas.collect.ec;

public class Student {
	private int studentId;
	private String studentName;
	private int marks;
	
	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String displayStudentDetails() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + "]";
	}
	
	
	
}

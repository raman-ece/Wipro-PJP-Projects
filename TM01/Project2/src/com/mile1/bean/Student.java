package com.mile1.bean;

public class Student {
String name;
int marks[];
public Student(String name,int marks[]) {
	this.setMarks(marks);
	this.setName(name);
}
public Student() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int[] getMarks() {
	return marks;
}
public void setMarks(int[] marks) {
	this.marks = marks;
}

}

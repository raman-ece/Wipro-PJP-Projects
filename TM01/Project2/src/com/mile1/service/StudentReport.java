package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.*;
public class StudentReport {
public String findGrade(Student studentObject) {
	int[] col=studentObject.getMarks();
	int sum=0;
	if (col[0]<35 || col[1]<35 || col[2]<35) {
		return "F";
	}
	else {
		for(int i=0;i<col.length;i++) {
			sum=sum+col[i];
		}
		if (sum<=150) {			return "D";		}
		else if (sum>150 && sum<=200) {			return "C";		}
		else if (sum>200 && sum<=250) {			return "B";		}
		else if (sum>250 && sum<=300) {			return "A";		}
	}	
	return "F";
}
public String Validate(Student studentObject) throws NullMarksArrayException,NullNameException, NullStudentException {
	if (studentObject == null) {
		throw new NullStudentException();
	} else {
		if (studentObject.getName() == null) { 
			throw new NullNameException();
			
		}
		if (studentObject.getMarks()==null) {
			throw new NullMarksArrayException();
		}
		return findGrade(studentObject);
	}
	
	
}
}

package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
public int findNumberOfNullMarks(Student data[]) {
   int nullmarkcount=0;
   for (int i = 0; i < data.length; i++) {
	   try {
	   if(data[i].getMarks()==null) {
		   nullmarkcount++;
	   }}
	   catch(Exception e) {
		   
	   }
}
   return nullmarkcount;
}
public int findNumberOfNullNames(Student data[]) {
	int nullNamesCount = 0;
	
	for (int i = 0; i < data.length; i++) {
		try {
		if(data[i].getName()==null) {
			   nullNamesCount++;
		   }}
		catch(Exception e) {
			
		}
	}
	
	return nullNamesCount;
}
public int findNumberOfNullObjects(Student data[]) {
	int nullObjectsCount = 0;
	
	for (int i = 0; i < data.length; i++) {
		if (data[i] == null) nullObjectsCount++;;
	}
	
	return nullObjectsCount;
}
}

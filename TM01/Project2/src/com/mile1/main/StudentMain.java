package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.*;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	static Student data[] = new Student[4];

	static {
		for (int i = 0; i < data.length; i++) {
			data[i] = new Student();
			data[0] = new Student("A1", new int[] { 72, 73, 75 });
			data[1] = new Student("gfhs", new int[] { 92, 56, 99 });
			data[2] = new Student("GH", new int[] { 13, 88, 13 });
			data[3] = new Student(null, new int[] { 33, 88, 78 });
		}
	}

	public static void main(String args[]) {
		StudentService studentservice = new StudentService();
		StudentReport studentreport = new StudentReport();
		System.out.println("Grades Calculation");
		String x = null;
		for (int i = 0; i < data.length; i++) {
			try {
				x = null;
				x = studentreport.Validate(data[i]);
			} catch (NullNameException e) {
				System.out.println(e.toString());
			} catch (NullMarksArrayException e) {
				System.out.println(e.toString());
			} catch (NullStudentException e) {
				System.out.println(e.toString());
			}
			if (x != null) {
				System.out.println("Grade: " + x);
			}
			}
		System.out.println("Number of objects with Marks array as null= "+studentservice.findNumberOfNullMarks(data));
		System.out.println("Number of objects with Name as null= "+studentservice.findNumberOfNullNames(data));
		System.out.println("Number of objects that are Entirely null= "+studentservice.findNumberOfNullObjects(data));
	
	}
}

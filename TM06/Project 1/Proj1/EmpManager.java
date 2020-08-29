package Proj1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Proj1.Employee2;

public class EmpManager {
public static void main(String[] args) {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	try {
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Acer\\Documents\\Eclipse\\Object Serialization\\src\\Proj1\\EmpManager.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Acer\\Documents\\Eclipse\\Object Serialization\\src\\Proj1\\EmpManager.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		int choise=0;
		while(choise!=3) {
			
			System.out.println("1.Add an Employee"+"\n"
					+ "2.Display All"+"\n"
							+ "3.Exit");
			choise=Integer.parseInt(br.readLine());
			switch(choise) {
			case 1:
				Employee2 emp=new Employee2();
				
				System.out.println("Enter Employee ID: ");
				emp.setID(br.readLine());
				System.out.println("Enter Employee Name:");
				emp.setName(br.readLine());
				System.out.println("Enter Employee age: ");
				emp.setAge(br.readLine());
				System.out.println("Enter Salary: ");
				emp.setSalary(Double.parseDouble(br.readLine()));
				oos.writeObject(emp);
				break;
			case 2:
				Employee2 emp2=null;
				System.out.println("----Report-----");
				while (fis.available() > 0) {
					emp2 = (Employee2) ois.readObject();
					System.out.println("ID = "+emp2.getID()+" Name= "+emp2.getName()+" Age= "+emp2.getAge()+" Salary= "+emp2.getSalary());
				}
				System.out.println("----End of Report-----");
				break;
				
			case 3:
				System.out.println("Exiting the system");
				fos.flush();
				fos.close();
				oos.flush();
				oos.close();
				fis.close();
				ois.close();
				break;
			}
			
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}

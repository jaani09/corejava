package Compareable1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmp1 {
	public static void main(String[] args) {
		ArrayList<Employee1>emp = new ArrayList<Employee1>();
		emp.add(new Employee1(5, "deepesh", "12345 "));
		emp.add(new Employee1(6,"harsh" ,"123456 "));
		emp.add(new Employee1(3, "ayush", "626290"));
		emp.add(new Employee1(1, "harry", "74150"));
		emp.add(new Employee1(2, "Nikhil", "999991"));
		
		System.out.println(emp);
		
		Collections.sort(emp,new ComparatorbyId() );
	System.out.println(emp);
	 ArrayList<Employee1>emp1 = new ArrayList<Employee1>(emp);
	 Collections.sort(emp1, new ComparatorbyId(s));
System.out.println(emp1);
		
		}

	
		}

		
		
		
		
		

		
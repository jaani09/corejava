  package Compareable1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestEmp {
public static void main(String[] args) {
	 ArrayList<Employee> e1 =new ArrayList();
	 e1.add(new Employee(1," harsh", "787787"));
	 e1.add(new Employee(2, "brown", "979797"));
	 e1.add(new Employee(10, "Black", "656565"));
	 e1.add(new Employee(9,"nikhil","323232"));
	 e1.add(new Employee(8, "nikhil", "919191"));
	 
	 System.out.println(e1);
	 Collections.sort(e1);
	 System.out.println(e1);
}
}

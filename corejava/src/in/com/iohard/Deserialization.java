
package in.com.iohard;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) throws Exception    {
	
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\IO\\sagar1.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		
		Employee e =(Employee)in.readObject();
		
		System.out.println("empId="+e.empId);
		System.out.println("Name="+e.name);
		System.out.println("Salary="+e.salary);
		System.out.println("Bonus="+e.bonus);
		System.out.println("Total="+e.total);
		
		file.close();
		in.close();
		
			}
}
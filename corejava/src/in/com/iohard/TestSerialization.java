package in.com.iohard;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("C:\\Users\\Hp\\Desktop\\IO\\sagar1.txt");
		 ObjectOutputStream out= new ObjectOutputStream(file);
    Employee e= new Employee();
                 e.empId=1;
		         e.name="harry";
		         e.salary=10000;
				 e.bonus=2000;
				 e.total=e.salary+e.bonus;
				 
				 out.writeObject(e);
		        file.close();
		        out.close();
		        out.close();
		        System.out.println("Object convert into byte Stream!!!!");
	}

}

package in.com.iohard;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Printer1 {
public static void main(String[] args) throws Exception {
	FileWriter file = new FileWriter ("C:\\Users\\Hp\\Desktop\\IO\\shiv.txt");		
	PrintWriter out = new PrintWriter(file);
	out.println("i am Nikhill");
	
	out.println(" he is placed in Amazon under the guidance of Shivam sir !!!!");
	
	out.println("now a days she is very happy!!!");
	
     	file.close();
	out.close();
	System.out.println("data write successfully");
}
}

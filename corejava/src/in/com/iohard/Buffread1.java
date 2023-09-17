package in.com.iohard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;



public class Buffread1 {
	

	public static void main(String[] args) throws Exception{
		FileReader file=new FileReader("C:\\Users\\Hp\\Desktop\\IO\\shubham.txt");
		BufferedReader reader=new BufferedReader(file);
		String line=reader.readLine();
		while(line!=null) {
			System.out.println(line);
			line=reader.readLine();
			
		}
reader.close();
file.close();
}
}

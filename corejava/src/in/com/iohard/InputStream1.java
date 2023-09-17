package in.com.iohard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

public class InputStream1 {
	public static void main(String[] args) throws Exception {
		InputStreamReader isReader= new InputStreamReader(System.in);
		BufferedReader in= new BufferedReader(isReader);
		PrintWriter out =new PrintWriter("C:\\Users\\Hp\\Desktop\\IO\\shunya.txt");
		
		 String line = in.readLine();
		while (!(line.equals("bye"))) {
			
			out.println(line);
			  line = in.readLine();
		}
		in.close();
		out.close();
		isReader.close();
	}

}

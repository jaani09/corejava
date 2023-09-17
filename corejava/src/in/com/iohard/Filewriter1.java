package in.com.iohard;

import java.io.FileWriter;
import java.io.Writer;

public class Filewriter1 {
	public static void main(String[] args) throws Exception {
		
		FileWriter writer = new FileWriter("C:\\Users\\Hp\\Desktop\\IO\\hardeep.txt");
		
		writer.write("hello i am hardeep");
		writer.write("finally placed it 12 lpa reffrence of deepesh supported by shunham");
		
		writer.close();
		System.out.println("data write successfully");
	}

}

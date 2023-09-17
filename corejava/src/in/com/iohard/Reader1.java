package in.com.iohard;

import java.io.FileReader;

public class Reader1 {
	public static void main(String[] args) throws Exception{
		FileReader reader = new FileReader("C:\\Users\\Hp\\Desktop\\IO\\shubham.txt");
				int ch=reader.read();
				while(ch!= -1) {
					System.out.print((char)ch);
					ch=reader.read();
				}
				reader.close();
		
		
	}

}

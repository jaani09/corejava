package in.com.iohard;

import java.io.FileInputStream;

import java.io.FileOutputStream;

public class FileInput1 {
	public static void main(String[] args) throws Exception {
		FileInputStream in= new FileInputStream ("C:\\Users\\Hp\\Desktop\\IO\\bike.jpg");
		FileOutputStream out= new FileOutputStream("C:\\Users\\Hp\\Desktop\\IO\\gopal.jpg");
		
		int ch=in.read();
		while(ch!=-1) {
			out.write(ch);
			ch=in.read();
			}
		in.close();
		out.close();
		System.out.println("data copy successfully");
	}

}

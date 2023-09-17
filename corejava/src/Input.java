import java.io.FileReader;


public class Input {
	public static void main(String[] args) throws Exception{
		FileReader reader = new FileReader("C:\\Users\\Hp\\Desktop\\IO\\jojo.txt");
				int ch=reader.read();
				while(ch!=1) {
					System.out.println((char)ch);
					ch=reader.read();
				}
				reader.close();
		
		
	}

}

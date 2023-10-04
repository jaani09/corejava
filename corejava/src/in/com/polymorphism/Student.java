package in.com.polymorphism;

public class Student {
	public void read() {
		
		System.out.println("student reading this Book");

}
	public void read(String Bookname) {
		System.out.println("Book nmame");
	}
	public void read(String writer,int rate) {
		
		System.out.println(writer);
		System.out.println(rate);
	}
}
package in.thread.com;

public class Testclass {
	public static void main(String[] args) {
		MyTr t1=new MyTr();
		Thread tr = new Thread(t1);
		
		Myanother  m1 =new Myanother();
		
		
		tr.start();
		m1.start();
	}

}

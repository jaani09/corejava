package in.thread.com;

public class MultTheadTest {
	public static void main(String[] args) {
		System.out.println("program start");
		int x =100+100;
		System.out.println("sumis="+x);
		
		Thread t= Thread.currentThread();
		String tname =t.getName();
		System.out.println(t.getName());
		
		t.setName("Mythread");
		System.out.println(t.getName());
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		   System.out.println(e);
		}
		System.out.println(t.getId());
        System.out.println("programme end");		

}
}
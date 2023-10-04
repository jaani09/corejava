package in.thread.com;

public class TestWith {
	public static void main(String[] args) {
		Withthread t1 = new Withthread("deepesh");
		Withthread t2 = new Withthread("shuvan");
		
		t1.setPriority(10);
		t2.setPriority(5);
		
		t1.start();
		t2.start();
	}

}

package in.thread.com;

public class MyTr implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 11; i++) {
			System.out.println("My threads Value="+i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}
	

		
	

		
	
}


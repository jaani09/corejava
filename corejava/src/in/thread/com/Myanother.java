  package in.thread.com;

public class Myanother extends Thread{
 @Override
public void run() {
	for (int i = 10; i>=0; i--) {
		System.out.println("Myanother Thread="+i);
		
		try {
			Thread.sleep(1000);
		} catch ( Exception e) {
			System.out.println(e);
		}
		
	}
	
	
}	
	
			
		
	}



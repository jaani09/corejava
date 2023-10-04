package Demonthread1;

public class TestBackgroundthread {
	public static void main(String[] args) {
		
		Backgroundthread  t1 = new Backgroundthread("Demon Thread");
		
		t1.setDaemon(true);
		t1.start();
		
		for (int i = 0; i <10; i++) {
			
			try {
				Thread.sleep(200);
				} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+"main");
		}

	}

}

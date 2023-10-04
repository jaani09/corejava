package Demonthread1;

public class Backgroundthread extends Thread {
	String name = null;
	 

public Backgroundthread(String name) {
	 this.name=name;
 }
 @Override
public void run() {
	while(true) {
	
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name);
}
 }
}
	 
	




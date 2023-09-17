package in.com.batch;

public class Random {
	public static void main(String[] args) {
		
		int max=200;
		int min=55;
		int range=max-min;
		for(int i=0; i<=5; i++) {
			 
			int rd=(int)(Math.random()*range);
			System.out.println(rd);
		}
	} 
	

}

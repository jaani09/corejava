package in.com.batch;

public class Divisible {
	
	public static void main(String[] args) {
		int a =8;
		int count =0;
		int sum=0;
		for (int i = 1; i <=200; i++) {
			if (i%8==0) {
				
				count=i;
				System.out.println(count);
				
				sum = sum+i;
			}
    			
		}
		System.out.println(sum);
	}

}

package in.com.batch;

public class Palindrom {
	
	public static void main(String[] args) {
		
		int a=122;
		int b=a;
		int c=0;
		int d;
		
		while(b>0) {
			
			d=b%10;
			c=c*10+d;
			b=b/10;
			
			
		}
		if (a==c) {
			
			
			
			System.out.println("yes this palindrome number");
			
		}else {
			System.out.println("no this not palindrome number");
		}
		  
		
		
	}
	
	

}

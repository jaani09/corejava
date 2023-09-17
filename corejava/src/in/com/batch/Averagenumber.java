package in.com.batch;

public class Averagenumber {
	public static void main(String[] args) {
		
	
	int a=10;
	int sum=0;
	int count=0;
	int avg;
	
	for(int i=1;i<=a; i++) {
		if (i%2==0) {
			// even or odd both if even(0) ,odd(1);
			
			sum=sum+i;
			count++;
		}
	}
	avg=sum/count;
	System.out.println(avg);
	}
 
}

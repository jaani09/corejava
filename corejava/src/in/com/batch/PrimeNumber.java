package in.com.batch;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=10;
		int count=0;
		for (int i=2;i<num;i++) {
			if(num%2==0) {
				count++;
			}
		}
		if(count==0)	{
			System.out.println("prime number");
		}else {
			System.out.println("not prime number");
		}

	}

}

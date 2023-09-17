package in.com.batch;

public class Secondlargest {

	public static void main(String[] args) {
		int[] arr= {5,9,8,7,4};
		int a=0;
		int b=0;
	
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>a) {
				a=b;
				b=arr[i];  
			}
			
			if (arr[i]<b && arr[i]>a) {
				
				b=arr[i];
				
			}
			
		}
      System.out.println(b);
	}

}

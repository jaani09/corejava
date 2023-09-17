package in.com.batch;

public class Opmethod1 {
 public void  sum (int a,int b,int e) {
	 int c=a+b+e;
	 System.out.println( " sum="+c);
	 
 }
 public void mult( int a,int b) {
	 int c=a*b;
	 System.out.println("mult="+c);
	 }
  public void noteCount (int number) {
	   int[]note = { 500,200,100,50,20,10};
	   int Count=0;
	   for (i=0; i<note.length;i++) {
		   Count= number/note[i];
		   if (Count>0) {
			    System.out.println(note[i]+"="+Count );
			    }
		   number=number% note[i];
	   }
  }
   public void largest (int[]arr) {
	   int max=0;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]>max)
	   }
   }
	
		
	}
  
  
  
  
  
  



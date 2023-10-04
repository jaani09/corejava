
package Construtioncalling;

public class TestB1 {
	public static void main(String[] args) {
		B1 r =  new B1();
		B1 r2 = new B1(1000);
		B1 r3 = new B1(999.99,"p");
		
		System.out.println(r.a+" "+r.b+" "+r.c);
		System.out.println(r2.a);
		System.out.println(r3.b+" "+r3.c);
		
		
		
		
	}

}

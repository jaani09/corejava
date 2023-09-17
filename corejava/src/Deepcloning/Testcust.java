package Deepcloning;

public class Testcust{
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c1=new Customer("Shivam");
		Customer c2= (Customer) c1.clone();
		c2.name="nik";
		c2.a.balance=50000;
		System.out.println("ORIGINAL");
		System.out.println("NAME="+c1.name);
		System.out.println("BALANCE="+c1.a.balance);
		
		System.out.println("DUPLICATE CLONEABLE");
		System.out.println("NAME="+c2.name);
		System.out.println("BALANCE="+c2.a.balance);
		
						
		
	}
	
}
	
	

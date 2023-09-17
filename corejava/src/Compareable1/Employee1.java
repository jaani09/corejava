package Compareable1;

public class Employee1 {
	public static void main(String[] args) {
		
	}
	
	private int empId=0;
	private String name =null ;
	private String phone = null ;
	
	public Employee1( int empId, String name,String phone) {
		this.empId=empId;
		this.name=name;
		this.phone=phone;
	}
	public void setId(int id) {
		this.empId=id;
	}
     public int getId() {   
		return empId;
     }

    public void setName(String name) {
	this.name=name;
}
   public String getName() {
	return name;
}
   public void setphone() {
	this.phone=phone;
}
   public String getphone() {
	return phone;
}
   @Override
public String toString() {
		return empId+" "+name+" "+phone;
}
	
}

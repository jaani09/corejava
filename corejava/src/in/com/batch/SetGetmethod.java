package in.com.batch;

public class SetGetmethod {
	  
			  private String name=null;
			  private String address= null;
			  private String DateOfBirth=null; 
			  
			  public String getName() { 
				  return name;
			  }
		  public void setname(String n) {
			  name = n ;
		  }
		  public String getAddress() {
			  return address;
			  		  }
		  public void setAddress(String a) {
			  address=a;
		  }
		  public String getDateOfBirth() {
			  return DateOfBirth;
		  }
		  public void setDateOfBirth(String d) { 
		  DateOfBirth=d;
		  }
		   
    public static void main(String[] args) {
    	SetGetmethod p=new SetGetmethod ();
		
		
		p.setname("Shivam");
		p.setAddress("indore");
		p.setDateOfBirth("07/11/1999");
		
		System.out.println("Name:"+p.getName());
		System.out.println("Adress:"+p.getAddress());
		System.out.println("DateofBirth:"+p.getDateOfBirth());
		
    }

	
}


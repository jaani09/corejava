package in.com.encapsulation;

public class TestEncapsultion {
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		
		e.setEmpId(100);
		e.setPhone(657485457);
		
		System.out.println(e.getEmpId());
		System.out.println(e.getPhone());
	}

}

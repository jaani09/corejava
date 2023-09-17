package in.com.inheritance;

public class TestshapeClass extends ShapeClass{
	public static void main(String[] args) {
		ShapeClass[]s=new ShapeClass[3];
		
		s[0]=new RactangleClass();
		s[1]=new CircleClass();
		s[2]=new TriangleClass();
		
		RactangleClass r=(RactangleClass) s[0]; 
		r.setLength(10);
		r.setWidth(10);
		r.area();
		
		CircleClass c=(CircleClass) s[1];
		c.setRadius(12);
		c.area();
		
		TriangleClass t=(TriangleClass) s[2];
		t.setBase(10);
		t.setHeight(15);
		t.area();
		 
	//	for (int i = 0; i < s.length; i++) {
		//	System.out.println(s[i]. area ());
		}
		
		
	}
	



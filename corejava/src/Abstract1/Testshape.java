package Abstract1;

public class Testshape {
 public static void main(String[] args) {
	 Shape s=new Reactangle();
	  
	 s.area();
	 Shape.hello();
	 
	 Reactangle r=(Reactangle)s;
	 r.area();
	 r.hello();
 }
}

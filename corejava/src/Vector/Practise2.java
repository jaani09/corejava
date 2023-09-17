package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Practise2 {
public static void main(String[] args) {
	  Vector v =new Vector();
	  v.add("one");
	  v.add(1);
	  v.add(2);
	  v.add(9);
	  v.add("fine");
	     
	  
	  
	  Enumeration e = v.elements();
      v.add("hardeep");
      v.add("Nikhil");
      v.add("three");
      
      System.out.println(v);
      
      while(e.hasMoreElements()) {
    	  System.out.println(e.nextElement());
      }





}

}



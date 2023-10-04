package Compareable1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
public static void main(String[] args) {
	List<Integer> List = new ArrayList<Integer>();
	List.add(20);
	List.add(21);
	List.add(22);
	List.add(55);
	List.add(52);
	List.add(50);
	System.out.println(List);
	
	List<Integer>evenlist=new ArrayList<Integer>();
	
   for(Integer i:List) {
	   if (i%2==0) { 
		   evenlist.add(i);
	   
   }
   }
	System.out.println(List);
	System.out.println(evenlist);
	
	Stream<Integer> stream =List.stream();
	List<Integer> newlist =stream.filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(newlist);
	
	Stream<Integer> stream1 =List.stream();
	List<Integer> newList1 = stream1.filter(e-> e>50).collect(Collectors.toList());
	System.out.println(newList1);
}
}

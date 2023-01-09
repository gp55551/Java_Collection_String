package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arraylist_removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//1- Using LinkedHashSet
		
	 ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
	 System.out.println("ArrayList with duplicate elements: " + list);

	 LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>(list);
	
	 ArrayList<Integer> noduplicates = new ArrayList<>(hs);
	 
	 System.out.println("ArrayList without duplicate elements: " + noduplicates);
	
	//2- using Stream class
	//introduced in JDK 8 
	// Here, we have used the Stream class to remove duplicate elements from the arraylist.

	// numbers.stream() - create a stream from the arraylist
	// stream.distinct() - removes duplicate elements
	// stream.collect(Collectors.toList()) - returns a list from the stream
	
	ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3));
	System.out.println("ArrayList with duplicate elements: " + numbers);

	List<Integer> nums = numbers.stream().distinct().collect(Collectors.toList());
	
	System.out.println("ArrayList without duplicate elements: " + nums);
	
	
	///----------------
	
	 List<String> l = new ArrayList<String>();  
     l.add("Mango");  
     l.add("Banana");  
     l.add("Mango");  
     l.add("Apple");  
     System.out.println(l.toString());  
     HashSet<String> s = new HashSet<String>(l);  
     System.out.println(s);  
     
     
     
     
     
	
	
	}

}

package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * this class has basic methods asked in interview for arrrayList
		 */
		
		ArrayList<String> str = new ArrayList<String>();
		//to add objects to str
		str.add("utkarsh");
		str.add("karpate");
		System.out.println(str);
		
		
		//output [utkarsh, karpate]


		//add element at a particular index
		str.add(0, "Kavya");
		System.out.println(str);
		//output [Kavya, utkarsh, karpate
		
		//to remove from a particular index.
		str.remove(1);
		System.out.println(str);
		
		//output [Kavya, karpate
		
		//to remove an object
		str.remove("Kavya");
		System.out.println(str);
		//output- [karpate]
		
		str.add("apple");
		str.add("mango");
		str.add("banana");
		Collections.sort(str);
		System.out.println(str);
		//output- [apple, banana, karpate, mango]
		
		//get string at some index
		System.out.println(str.get(3));
		//output-mango
		
		//if a string is present or not-- the method returns true if present and false if not present. the string is case sensitive
		System.out.println(str.contains("June")); 
		//output-false
		System.out.println(str.contains("karpate")); 
		//output-true
		
		//get index of certain element-
		System.out.println(str.indexOf("mango"));
		//output- 3
		System.out.println(str.indexOf("utkarsh"));
		//output- -1 since the string is not present
		
		//to know size of arraylist
		System.out.println(str.size());
		//output- 4
		
	}

}

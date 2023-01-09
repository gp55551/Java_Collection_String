package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * COncepts related to Hashset. Interview questions
		 * 
		 * 
		 * 
		 */
		
		HashSet<Integer> hs = new HashSet<Integer>();
		//add elements in hashset;
		
		hs.add(1);
		hs.add(2);
		hs.add(23);
		
		//if there are duplicate values being added, set will not accept it
		System.out.println(hs);
		//output- [1, 2, 23]
		
		//order of insertion is not preserved.
		//re-run and see the output
		//output order can be different
		
		//remove elements
		hs.remove(1);
		System.out.println(hs);
		
		//output-[2, 23]
		
		//know the size of set
		System.out.println(hs.size()); 
		//output- 2
		
		/*
		 * to traverse thru a set, Iterator concept is used, we cannot get an element from a certain index like ArrayList or LinkedList
		 */
		
		HashSet<String> str = new HashSet<>();
		str.add("Utkarsh");
		str.add("Kavya");
		str.add("sampada");
		str.add("ashish");
		str.add("samrudhi");
		
		
	Iterator<String> i = str.iterator();
	System.out.println(i.next()); //output- samrudhi
	System.out.println(i.next()); //ashish
	System.out.println(i.next()); //kavya
	//output will not be according to the insertion oder
	
	//instead of writing next() everytime, we can print all the elements of set using hasnext() which return true if next element is present
	
	while(i.hasNext()) {
		System.out.println(i.next()); //
		
		/*
		 * samrudhi
ashish
Kavya
Utkarsh
sampada

		 */
		
	}
	
	}

}

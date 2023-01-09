package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Concepts related to treeset and methods asked in interview
		 * 
		 * 
		 */
		
		TreeSet<String> str = new TreeSet<>();
		str.add("utkarsh");
		str.add("kavya");
		str.add("sampada");
		str.add("samrudhi");
		str.add("ashish");
		
		//iterator works with treeset as well
		Iterator<String> i = str.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			/*
			 * ashish
kavya
sampada
samrudhi
utkarsh
			 */
			
			
			//see the insertion order and output. Output is always sorted by default in treeset
			//Capital character takes precedence while sorting
		}
		
		System.out.println(str.contains("Utkarsh")); //true.
		System.out.println(str.first()); //ashish, this method is not present in hashset
		System.out.println(str.last()); //utkarsh, this method is not present is hashset

	}

}

package Collections;

import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Contains concept related to linkedList class
		 */
		
		LinkedList<String> l  = new LinkedList<String>();
		l.add("Utkarsh");
		l.add("Kavya");
		System.out.println(l);
		//output-[Utkarsh, Kavya]
		l.addFirst("Samrudhi"); //this method is not available in arrayList
		System.out.println(l);
		//output-[Samrudhi, Utkarsh, Kavya]
		l.addLast("Sampada"); //this method is not available in arrayList
		System.out.println(l);
		//output-[Samrudhi, Utkarsh, Kavya, Sampada]

	}

}

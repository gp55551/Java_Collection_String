package Collections;

import java.util.Hashtable;

public class HashTableConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Hashtable Concepts-
		 */
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		//to add elements, put is used
		ht.put(0, "Utkarsh");
		ht.put(1, "Samrudhi");
		ht.put(2, "Sampada");
		ht.put(3, "Ashish");
		ht.put(4, "Kavya");
		ht.put(null, null); //hashtable does not allow
		System.out.println(ht);
		//{4=Kavya, 3=Ashish, 2=Sampada, 1=Samrudhi, 0=Utkarsh}
		
		ht.remove(1);
		System.out.println(ht); //{4=Kavya, 3=Ashish, 2=Sampada, 0=Utkarsh}
		
		
		

	}

}

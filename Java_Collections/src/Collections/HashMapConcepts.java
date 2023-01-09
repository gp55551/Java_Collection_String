package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Hashmap related concepts asked in interview
		 */
		
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		//to add elements, put is used
		hm.put(0, "Utkarsh");
		hm.put(1, "Samrudhi");
		hm.put(2, "Sampada");
		hm.put(3, "Ashish");
		hm.put(4, "Kavya");
		hm.put(null, "Mohan");//hashmap allow one null key
		hm.put(10, null); //hashmap allows one null value
		hm.put(null, "bye"); //allows only one null key and one null value
		
		System.out.println(hm);
		//output- {0=Utkarsh, 1=Samrudhi, 2=Sampada, 3=Ashish, 4=Kavya}
		
		System.out.println(hm.get(2)); //Sampada
		
		hm.remove(3);
		System.out.println(hm); //{0=Utkarsh, 1=Samrudhi, 2=Sampada, 4=Kavya
		
		//if key is not present and we are trying to perform certain actions
		System.out.println(hm.get(5)); //output-null
		
		hm.replace(0, "Anjali");
		System.out.println(hm); //{0=Anjali, 1=Samrudhi, 2=Sampada, 4=Kavya}
		
		System.out.println(hm.values()); //[Anjali, Samrudhi, Sampada, Kavya]
		
		System.out.println(hm.keySet());//[0, 1, 2, 4]
		
		//we cannot traverse thru map, to do that, first convert the map to set using entrySet
		 Set set = hm.entrySet();
		 Iterator i = set.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());  /*0=Anjali
1=Samrudhi
2=Sampada
4=Kavya
			 */
		 }
		 
		
		
		
		
	}

}

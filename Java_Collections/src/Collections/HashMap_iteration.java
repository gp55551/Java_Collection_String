package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		//to add elements, put is used
		hm.put(0, "Gaurav");
		hm.put(1, "Sandy");
		hm.put(2, "Abc");
		hm.put(3, "Xyz");
		hm.put(4, "Kavya");
		
		System.out.println(hm);
			
		//we cannot traverse thru map because Map are not Collection, to do that, first convert the map to set using entrySet
		
		//Using entrySet method - old style
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			 System.out.println(i.next()); 
		 }
		 
		//Using for-each loop for iteration over Map.entrySet()
        for (Entry<Integer, String> entry : hm.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		
		
        //Using keySet() for iteration over keys
        for (Integer name : hm.keySet()) 
            System.out.println("key: " + name);
          
        //Using values() for iteration over values
        for (String url : hm.values()) 
            System.out.println("value: " + url);
        
        
		
	}

}

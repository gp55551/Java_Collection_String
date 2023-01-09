package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class LambdaExpPrintListMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MAP
		HashMap<Integer, String> hm = new HashMap<>();
		
		//to add elements, put is used
		hm.put(0, "Gaurav");
		hm.put(1, "Sandy");
		hm.put(2, "Abc");
		hm.put(3, "Xyz");
		hm.put(4, "Kavya");
		
		System.out.println(hm);
			
		//Print the key and value of Map using Lambda expression
		
		hm.forEach((key, value) -> {System.out.println( "Key: " + key + " - Value:" + value);});
        
		//LIST
		
		//Print the key and value of Map using Lambda expression
		
		ArrayList<String> list = new ArrayList<String>();
		
		//to add objects
		list.add("gaurav");
		list.add("patnaik");
		list.add("sandy");
		list.add("biswas");

		System.out.println(list);
		
		list.forEach((value) -> {System.out.println( "Value:" + value);});
        
		
	}

}

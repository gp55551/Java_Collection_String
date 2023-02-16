package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Arraylist_fromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = {"gaurav", "patnaik", "sandy", "biswas"};
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(String name : arr)
		{
			list.add(name);
		}
		
		for(String name1 : list)
		{
			System.out.println(name1);
		}
		
	}

}

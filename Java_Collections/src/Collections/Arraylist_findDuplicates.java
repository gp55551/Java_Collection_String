package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Arraylist_findDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
        list.add("Sagio Mane");
        list.add("Karius");
        list.add("Mo Salah");
        list.add("Firmino");
        list.add("Lovren");
        list.add("Steven Gerrard");
        list.add("Karius");
        list.add("Mo Salah");

        Set<String> s = new HashSet<String>();

        for(String name : list) {
            if(s.add(name) == false)
                System.out.println(name + "is duplicated");
        }
        
	}

}

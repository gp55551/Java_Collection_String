package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Arraylist_fetchDataStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
        list.add("Sagio Mane");
        list.add("Karius");
        list.add("Mo Salah");
        list.add("Firmino");
        list.add("Lovren");
        list.add("Steven Gerrard");

        String chars = "M";
        for (String element : list){
            if (element.startsWith(chars)){
                System.out.println(element);
            }
        }
        
	}

}

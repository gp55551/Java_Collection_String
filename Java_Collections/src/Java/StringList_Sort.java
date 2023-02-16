package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class StringList_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// use treeset to store elements in ascending order

		String x[] = { "FirstName", "LastName", "Place", "Gender", "Address" };

		TreeSet<String> ts = new TreeSet<String>();

		for (int i = 0; i < x.length; i++) {
			ts.add(x[i]);
		}

		System.out.println(ts);
	}
}

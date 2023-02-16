package Java;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListString_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//using compareTo method
		
		String x[] = { "FirstName", "LastName", "Place", "Gender", "Address" };

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i].compareTo(x[j]) > 0) {
					String temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}

		}

		for (int k = 0; k < x.length; k++) {
			System.out.println(x[k]);
		}

	}
}

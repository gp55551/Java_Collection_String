package Java;

import java.util.ArrayList;
import java.util.Arrays;

public class Altimetrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				
	String x[] = {"FirstName","LastName","Place","Gender","Address"};
	
	for(int i=0;i<x.length;i++) {
		/*String c= x[i];
		char firstchar = c.charAt(0);
		System.out.println(firstchar);
		ArrayList<String> s= new ArrayList<>();
		s.addAll(firstchar);*/
		
		for(int b=i+1 ; b<x.length; b++) {
			if(x[i].compareTo(x[b])>0) {
				String temp = x[i];
				x[i] = x[b];
				x[b] = temp;
			}
		}
		
		
		
		
	}
	System.out.println(Arrays.toString(x));
	
	
	/*for(int k=0;k<x.length;k++) {
		System.out.println(x[k]);
	}*/
	
		
		
	
	/*0
	1 1
	2 3 5
	8 13 21 34
	55 89 144 233 577*/

}
}

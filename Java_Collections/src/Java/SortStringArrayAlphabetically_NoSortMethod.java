package Java;
import java.util.Arrays;

public class SortStringArrayAlphabetically_NoSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x[] = {"FirstName","LastName","Place","Gender","Address"};
		
		for(int i=0;i<x.length;i++) {
			
			for(int b=i+1 ; b<x.length; b++) {
				if(x[i].compareTo(x[b])>0) {
					String temp = x[i];
					x[i] = x[b];
					x[b] = temp;
				}
			}
			
			
		}
		System.out.println(Arrays.toString(x));
		
		
		for(String i : x)
			{
			System.out.println(i);
			}

	}

}

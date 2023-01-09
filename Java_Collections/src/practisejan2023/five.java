package practisejan2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import Java.RemoveDuplicatesAndPrintUniqueNumber_Array;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		//Stringmutable();
		SwapStrings();
		vowelscount();
		
		
	}
	
	public static void  Stringmutable() {
		

		String s = "hello";
		String s2 = "hello";
		
		s.concat("world");
		System.out.println(s);
		
		
		
		//how to make mutable
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);
	}
	
	public static int SumArray(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i<a.length; i++) {
			sum = sum +a[i];
		}
		
		return sum;
	}
	
	
	public static void  SwapWithoutAndWithTempVariable() {
		
		//using temp variable
		int a = 5; 
		int b = 8;
		int temp = 0;

		temp = a;   //here temp becomes 5
		a=b; //a becomes 8
		b=temp; //b becomes 5

		System.out.println(a);
		System.out.println(b);


		//without using temp variable

		int c=7;
		int d=10;
		
		c= c+d; //c becomes 17
		d = c-d; //d becomes  7
		c = c-d; //c becomes 10

		System.out.println(c);
		System.out.println(d);
	}
	
	//vv imp
	public static void  SwapStrings() {
		
	 String str1 = "Good ", str2 = "morning ";    
	 
	 str1 = str1 +str2;
	 
	 //Goodmorning
	 
	 str2 = str1.substring(0,str1.length()-str2.length());
	 //index from 0 to next string-1 
	 str1 = str1.substring(str2.length());
	 //index begins from 2nd string
	 
	 
	 System.out.println(str1);
	 System.out.println(str2);

	}
	
	public static void  vowelscount() {
		
		  String str = "GeeksForGeeks";
	      str = str.toLowerCase();
	      int count = 0;

	      for (int i = 0; i < str.length(); i++) {
	          // check if char[i] is vowel
	          if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
	              || str.charAt(i) == 'i'
	              || str.charAt(i) == 'o'
	              || str.charAt(i) == 'u') {
	              // count increments if there is vowel in
	              // char[i]
	              count++;
	          }
	      }

	      // display total count of vowels in string
	      System.out.println(
	          "Total no of vowels in string are: " + count);
		}
	
	
	
	
	
	

}
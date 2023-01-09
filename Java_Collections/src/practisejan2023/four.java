package practisejan2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import Java.RemoveDuplicatesAndPrintUniqueNumber_Array;

public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		secondlargestinArray();
		
		
		
	}
	
	public static void  secondlargestinArray() {
		
		int abc[] = {2,3,55,22,32,55,88,19};
		int temp;
		
		for(int i = 0 ; i < abc.length ; i ++)
		{
			for(int j = i+1 ; j < abc.length ; j ++)
			{
				if(abc[i]>abc[j])
				{
					temp = abc[i];
					abc[i]= abc[j];
					abc[j]=temp;
				}
			}
		}
		
		System.out.println("largest : "+abc[abc.length-1] );
		System.out.println("2nd largest : "+abc[abc.length-2] );
		System.out.println("smallest : "+abc[0] );
		System.out.println("2nd smallest : "+abc[1] );
	}
	
	
	public static void  sortarrayAscending() {
		
		int a[] = {3,4,6,1,2,0};
		int temp =0;
		for (int i=0; i<a.length; i++) {
			for(int j= i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
		
		for (int k=0; k<a.length; k++) {
			System.out.println(a[k]);
		}
	}
	
	public static void  sortarrayDescending() {
		
		int a[] = {45,76,98,12,109};
		int temp  =0;

		for (int i = 0; i<a.length ; i++) {
			for (int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					temp =a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
		}
	
		for (int i =0 ; i<a.length; i++)
			{
			System.out.println(a[i]);
			}
	
	}
	public static void  SortStringArrayAlphabetically_NoSortMethod() {
		
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
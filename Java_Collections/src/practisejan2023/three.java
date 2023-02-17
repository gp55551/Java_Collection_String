package practisejan2023;

import java.util.ArrayList;
import java.util.HashMap;

import Java.Array_RemoveDuplicatesAndPrintUniqueNumber;

public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		//primeNumberinRange();
		//printOccurenceofMultipleCharStringHashmap();
		//RemoveCommainString();
		//RemoveDuplicatesAndPrintUniqueNumber_Array();
		//ReverseNumber();
		
		ReverseWordsInString();
	}
	
	
	


	public static void  primeNumberinRange() {
		
		int low = 7;
		int high = 35;
		
		while (low<high)
		{
			int flag = 0 ;

			for (int i = 2 ; i <= low/2 ; i ++)
			{
				if (low%i == 0)
				{
					flag =1 ;
					break;
				}
					
			}
			if(flag==0)
			{
				System.out.print(low+"-");
			}
			low++;

		}
	}
	
	//VERY VERY IMP
	public static void printOccurenceofMultipleCharStringHashmap() {
		// TODO Auto-generated method stub
		String  r = "SSDRRRTTYYTYTR";
		
		HashMap<Character, Integer> hm = new HashMap<>();	
		
		for(int i = 0 ; i < r.length(); i ++)
		{
			if(!hm.containsKey(r.charAt(i)))
			{
				hm.put(r.charAt(i), 1);
			}
			else
			{
				int count = hm.get(r.charAt(i));
				count++;
				hm.put(r.charAt(i), count);
						
			}
		}
		
		System.out.println(hm);
	}
	
	//{R=4, S=2, D=1, T=4, Y=3}
	
	public static void RemoveCommainString() {
	
		String str = "My ,name ,is ,Gaurav";
		
		String word[] = str.split(",");
		
		String temp = "";
		for(int i = 0 ; i<word.length;i++)
		{
			temp = temp + word[i];
		}
		
		System.out.println(temp);
	}
	
	//vvv imp
	private static void RemoveDuplicatesAndPrintUniqueNumber_Array() {
		// TODO Auto-generated method stub
	int a[] = {4,5,5,4,6,6,7,7,10};
		
		//output should be below-
		/*
		 * 4 repeated 2 times
		 * 5 repeated 2 times
		 * 6 repeated 2 times
		 * 7 repeated 1 times
		 */
		
		/*
		 * algorithm-
		 * prepare an empty arraylist and pass 4. Check if 4 is already present in it or not
		 * checkpoint- scan again and see if 4 is present, if present increase the count of variable. but dnt push it in AL
		 */
		
		
		/*
		 * Print unique number from the list
		 */
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i=0; i<a.length; i++) {
			int k=0;
			if(!al.contains(a[i])) //here we are checking if the element is present in arraylist or not
			{
				//if the element is present skip it
				//explanation of negation- the if loop will return true if the element is present, so negation would be false
				al.add(a[i]);
				k++;
				for(int j =i+1;j<a.length; j++) {
					//scan the remaining part if 4 is present or not
					//i+1 because there is no point starting form 0
					if(a[i]==a[j]) {
						k++;
					}
					
				}
				System.out.println(a[i] +" is present" + k +" times");
				if(k==1) { //to print the unique number
					System.out.println(a[i] +" is unique number");
				}
			}
			
		}
	

	}
	
	public static void ReverseNumber() {
		
		int number = 543;
		int reverse = 0;
		while(number != 0) {
			int digit = number %10;
			reverse = digit + reverse *10;
			number = number / 10;
			
		}
		System.out.println(reverse);
		
	}
	
	//vv imp
	public static void ReverseWordsInString() {
		
		String str = "My name is Gaurav";
		String word[] = str.split(" ");
		String temp = "";
		for(int i=word.length-1;i>=0;i--)
		{
			if(i==0)
			{
				temp = temp + word[i];
			}
			else
			{
				temp = temp + word[i]+" ";
			}
			
		}
		System.out.println(temp);

		
		
	}
	
	
	

}
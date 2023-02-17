package Java;
import java.util.ArrayList;

public class Array_RemoveDuplicatesAndPrintUniqueNumber {

	public static void main(String[] args) {
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

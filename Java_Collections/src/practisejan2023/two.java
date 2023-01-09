package practisejan2023;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//MaxDifferenceAdjacentIndex();
		//MaximumNumberInArray();
		//MaximumNumberinMultiDArray();
		//MinimumNumberInArray();
		//NumberOfSpacesInAWord();
		//palindromeNumber();
		primenumber();
		
		
		
		
	}
	
	public static void  MaxDifferenceAdjacentIndex() {
		
	int arr[] = {1,3,5,7,10,11,23,41};
	
	int maxdiff = 0 ;
	
	for (int i = 0 ; i<arr.length-1;i++)
	{
		if(arr[i+1]-arr[i]>maxdiff)
		{
			maxdiff = arr[i+1]-arr[i];
		}
	}
	System.out.println(maxdiff);
		
	}
	
	
	public static void  MaximumNumberInArray() {
		
		int arr[] = {1,3,222,5,7,10,11,23,41};
		 
		
		int max = arr[0] ;
		
		for (int i = 0 ; i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
			
		}
	
	public static void  MaximumNumberinMultiDArray() {
		
		int abc[][] = {{2,4,5},{3,4,7}, {1,2,9}};
		int max = abc[0][0];
		 		
		for (int i = 0 ; i<abc.length;i++)
		{
			for (int j = 0 ; j<abc.length;j++)
			{
				if(abc[i][j]>max)
				{
					max = abc[i][j];
				}
			}
		}
		System.out.println(max);
			
		}
	
	
	public static void  MinimumNumberInArray() {
		
		int arr[] = {1,3,222,5,7,10,11,23,41};
		 
		
		int min = arr[0] ;
		
		for (int i = 0 ; i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println(min);
			
		}
	
	public static int multiply(int i, int j) { //i has to sum j times to get result
		// TODO Auto-generated method stub
		//multiplication without using multiply operator
		int multiply = 1;
		int sum = 0;
		while(multiply<=j) {
			sum = sum+i; 
			multiply++;
		}
		return sum;
	}
	
	public static void  NumberOfSpacesInAWord() {
		
		String word = "My name is gaurav";
		int count =0;
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
			
	}
	
	public static void  palindromeNumber() {
		
		int num = 12321;
		int rev = 0 ;
		while(num>0)
		{
			int digit = num%10;
			rev = rev*10 + digit;
			num = num/10;
			
		}
		
		System.out.println(rev);
	}
	
	public static void  primenumber() {
		
		int num = 7;
		int flag = 0 ;
		for (int i = 2 ; i <= num/2 ; i ++)
		{
			if (num%i == 0)
			{
				flag =1 ;
				break;
			}
				
		}
		
		if(flag==1)
		{
			System.out.println("Not a Prime number");
		}
		else
		{
			System.out.println("Prime number");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
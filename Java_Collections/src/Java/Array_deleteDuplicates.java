package Java;

public class Array_deleteDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {43,98,99,99,22,23,102};
		System.out.println("Array before removing duplicates : ");
		for(int i : a)
		{
			
				System.out.println(i);
			
			
		}
		for (int i = 0; i < a.length; i++)   
		        {  
		            for (int j = i + 1; j < a.length; j++)   
		            {  
		                if (a[i]==a[j])   
		                {  
		                   a[i]=-1;
		                }  
		            }  
		        } 
		
		System.out.println("Array after removing duplicates : ");
		
		for(int i : a)
		{
			if(i!=-1)
			{
				System.out.println(i);
			}
			
		}
		
		
		}  
	
	

	}



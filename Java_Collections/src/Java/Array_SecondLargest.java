package Java;

public class Array_SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {43,98,99,22,23,102};
		int temp;  
		for (int i = 0; i < a.length; i++)   
		        {  
		            for (int j = i + 1; j < a.length; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		for(int i : a)
		{
			System.out.println(i);
		}
		
		System.out.println(a[a.length-2]);
		
		}  
	
	

	}



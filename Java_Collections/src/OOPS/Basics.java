package OOPS;

public class Basics {

	int a  ;
	int b  ; 
	static int f = 12;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		for(int i = 0;i<arr.length ; i++)
		{
			arr[i] = i+1 ;
		}
		for(int i = 0;i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
		int i = 12 ;
		String j = "df";
		//int c = i + j ; compile time error. example - syntax error
		//System.out.println(i/0);  // runtime error	
		
		int[][] arr1 = new int[5][3];
		arr1[0][0] = 12;
		arr1[0][1] = 12;

		arr1[0][2] = 12;
		
		System.out.println(arr1[0][2]);
		
		
		//this keyword 
		//It can be used to refer instance variable of current class
		//It can be used to invoke or initiate current class constructor
		Basics b = new Basics();
		b.set(1,2);
		b.display();
		
		
		f++;
		System.out.println(f);
		
		
	}
	
	public void set(int a , int b)
	{
		this.a = a ;
		this.b = b ;
	
	}
	
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	

}

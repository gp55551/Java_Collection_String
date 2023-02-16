package OOPS;

public class privateConstructors {

	privateConstructors()
	{
		System.out.println("defualt");
	}
	
	public privateConstructors(float a )
	{
		
	}
	
	protected privateConstructors(int a )
	{
		
	}
	
	private privateConstructors(double a )
	{
		System.out.println("Private");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new privateConstructors(12.2);
	}

}

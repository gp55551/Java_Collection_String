package OOPS;

abstract class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			AbstractClass aa = new AbstractDerivedClass();
			aa.method1();
			aa.method2();
	}
	public abstract void  method1();
	public void method2()
	{
		System.out.println("A");
	}
	
	
	
	
}

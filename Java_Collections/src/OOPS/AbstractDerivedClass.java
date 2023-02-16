package OOPS;

public class AbstractDerivedClass extends AbstractClass {

	public static void main(String[] args) {
		AbstractClass ab = new AbstractDerivedClass();
		ab.method1();
		ab.method2();
		AbstractDerivedClass ab1 = new AbstractDerivedClass();
		ab1.method1();
		ab1.method2();
		
	}
	@Override
	public void method1() {
		System.out.println("derived");
		
	}
	public void method2()
	{
		System.out.println("A");
	}
	
	

	
}

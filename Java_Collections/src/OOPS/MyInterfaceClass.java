package OOPS;

public class MyInterfaceClass implements MyInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		MyInterfaceClass interfaceClass  = new MyInterfaceClass();
		interfaceClass.method1();
		
		MyInterface interfaceClass1 = new MyInterfaceClass();
		interfaceClass1.method1();
		
	}
	
	public void method1() {
		System.out.println("method");
	}

}

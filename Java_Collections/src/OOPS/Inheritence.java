package OOPS;

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base i = new Derived();
		i.method(23);
		
		AbstractClass absCl = new AbstractDerivedClass();
		absCl.method1();
		
		MyInterfaceClass myIntCls = new MyInterfaceClass();
		myIntCls.method1();
				
	}
	
}
	


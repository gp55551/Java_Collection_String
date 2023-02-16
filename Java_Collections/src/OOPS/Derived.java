package OOPS;

class Derived extends Base {

	Derived()
	{
		super();
		System.out.println("derived cons");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Derived a = new Derived();
		a.method();
		a.method(10);
		a.methodToOverrride(100);
		
		Base b = new Derived();
		b.method(11);
		b.methodToOverrride(100);
		
		
		Base c = new Base();
		c.method(100);
		c.methodToOverrride(100);
		
		//constructor
		Base aa = new Derived();
		Derived aa1 = new Derived();
		
		
		String aaa = "Infosys";
		String abb = "Infosys";
		
		System.out.println(aaa==abb);
		System.out.println(aaa.equals(abb));

		
		
	}
	
	void method() {
		System.out.println("derived");
	}
	
	void methodToOverrride(int a) {
		System.out.println("methodToOverrride");
		System.out.println(a);
	}

}

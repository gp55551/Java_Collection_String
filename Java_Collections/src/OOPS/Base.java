package OOPS;

class Base {

	Base()
	{
		System.out.println("base cons");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void method(int a) {
		System.out.println("base");
		System.out.println(a);
	}
	void methodToOverrride(int a) {
		System.out.println("methodToOverrride");
		System.out.println(a);
	}

}

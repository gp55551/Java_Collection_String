package OOPS;

public class Constructors {

	String frst = "Gaurav123";
	int empID = 123;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructors a = new Constructors("", 0);
	}

	public Constructors(String name, int empId) {
		System.out.println("cons");

		/// passing class variables values to the constructor
		name = frst;
		empId = empID;
		System.out.println(name + " - " + empId);

		/// passing default values to the constructor
		name = "Gaurav";
		empId = 123;
		System.out.println(name + " - " + empId);

	}
	
	
	
	

}

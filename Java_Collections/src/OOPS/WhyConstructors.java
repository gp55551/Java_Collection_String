package OOPS;

public class WhyConstructors {

	private String name ;
	private int empID; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhyConstructors a = new WhyConstructors();
	}
	
	//There can be a situation where exposing the class variable to the main program is not secure. 
	//At that point of time, class variables can be turned to private because the 
	//private variables are not accessible from the other classes. 
	//In this situation if the constructors are defined, then the main method would not need 
	//to access class variables directly.
	
	public WhyConstructors()
	{
		name = "Gaurav";
		empID = 12;
		System.out.println(name + " - " + empID);
	} 
	
	

}

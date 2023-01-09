package javaAdvanced;

public class singletonConcept {
	
	/* a singleton class is special class in OOPS which can have only a single instance of the class at a time. 
	 * We can create only one object.
	 * If we are trying to create multiple objects/instances, it will always point to the same object.
	 * 
	 * 
	 * To design Singleton class-
	 * 1. Make sure that the constructor of the class is private.
	 * 2. Write a static method that has return type object of this singleton class. This concept is also
	 * called as lazy initialization.
	 * 
	 * Difference between normal class and singleton class is that for normal class we use constructor to any number of objects
	 * whereas for singleton class we use a method to instantiate the object
	 * 
	*/
	
	//create a reference variable
	private static singletonConcept singletonobject = null;
	
	//create a normal variable
	public String str;
	
	//create a private constructor
	private singletonConcept(){
		str = "utkarsh";
	}
	
	//write a public static method, lazy initialization
	public static singletonConcept getinstance() {
		
		//writing an if condition
		if(singletonobject == null) {
			//then initialize the object
			singletonobject = new singletonConcept();
			
		}
		return singletonobject;	
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	singletonConcept x=	singletonConcept.getinstance(); //since its a static method
	singletonConcept y=	singletonConcept.getinstance(); 
	singletonConcept z=	singletonConcept.getinstance();
	
	//instantiating getinstance for three instance variables in the above statement
	
	x.str = (x.str).toUpperCase();
	System.out.println(x.str); //UTKARSH
	
	//try to do this for instance variables y and z
	System.out.println(y.str); 
	System.out.println(z.str);
	/*
	 * UTKARSH
UTKARSH
UTKARSH
	 */
	//the above two statements will first look for whether the singletonobject is null or not and will see
	//that the object is already instantiated and stored in x. it will return the object using the return statement in the ()
	// now if we try to create multiple objects of the class, they all will point to x.
	
	
	 
	

	}

}

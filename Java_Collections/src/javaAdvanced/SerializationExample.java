package javaAdvanced;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample{
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Serialization is a process of converting of java object into a sequence of byte stream
		 * which can be persisted to  disk  or database and sent thru streams
		 * 
		 * A java object is serializable if its class or any of its sub classes implements the
		 * java.io.serializable or its sub interface java.io.Externalizable interface 
		 * 
		 * Classes ObjectOutputStream and ObjectInputStream are high level streams that contain the 
		 * methods for serialization and de-serialization
		 */
		
		EmployeeSerializationExample emp = new EmployeeSerializationExample();
		emp.name = "Utkarsh";
		emp.address = "Bhopal";
		
		try{
			FileOutputStream fos = new FileOutputStream("C:\\Users\\utkarsh.karpate\\Documents\\serial.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.close();
			fos.close();
			System.out.println("serialization done...");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
//within the txt file the byte stream would look like below-
		
		//¬í sr EmployeeSerializationExample«#™QMÚš× L addresst Ljava/lang/String;L nameq ~ xpt Bhopalt Utkarsh
		
		//to read this we will use deserialization concept
		
		
	}

}

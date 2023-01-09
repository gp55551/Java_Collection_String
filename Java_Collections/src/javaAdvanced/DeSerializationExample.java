package javaAdvanced;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		
		/*
		 * Converting the byte stream to object type is called deserialization
		 */
		
		
		EmployeeSerializationExample emp = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\utkarsh.karpate\\Documents\\serial.txt");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			emp = (EmployeeSerializationExample)ois.readObject();
			ois.close();
			fis.close();
		}
		finally {
			System.out.println("Employee name is " +emp.name);
			System.out.println("Employee address is " + emp.address);
		}
	}

}

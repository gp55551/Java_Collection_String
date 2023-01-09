package javaAdvanced;
import java.util.regex.Pattern;

public class Regex_pwdValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Geeks@portal20";
        System.out.println(isValidPassword(str1));
  
        // Test Case 2:
        String str2 = "Geeksforgeeks";
        System.out.println(isValidPassword(str2));
  
        // Test Case 3:
        String str3 = "Geeks@ portal9";
        System.out.println(isValidPassword(str3));
  
        // Test Case 4:
        String str4 = "1234";
        System.out.println(isValidPassword(str4));
  
        // Test Case 5:
        String str5 = "Gfg@20";
        System.out.println(isValidPassword(str5));
  
        // Test Case 6:
        String str6 = "geeks@portal20";
        System.out.println(isValidPassword(str6));
        
	}
	
	 public static boolean
	    isValidPassword(String password)
	    {
	  
	        // Regex to check valid password.
	        String regex = "^(?=.*[0-9])"
	                       + "(?=.*[a-z])(?=.*[A-Z])"
	                       + "(?=.*[@#$%^&+=])"
	                       + "(?=\\S+$).{8,20}$";
	 
	        // Return if the password
	        // matched the ReGex
	        return Pattern.matches(regex,password);
	    }

}

package Java;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "KATAK";
		String temp= "";
		
		for (int i=str.length()-1; i>=0; i--) {
			temp = temp + str.charAt(i);
			
			
			
		}
		System.out.println(temp);
		if(temp.equals(str)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		

	}
	
	
}

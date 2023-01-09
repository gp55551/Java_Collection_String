package Java;

public class ReverseStringWithoutUsingReverseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "madam";
		String s = "";
		for(int i= str.length()-1; i>=0; i--) {
		s = s+str.charAt(i);
		}
		if(s.equals(str)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}

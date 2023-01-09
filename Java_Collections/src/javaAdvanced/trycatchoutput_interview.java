package javaAdvanced;

public class trycatchoutput_interview {

	public static void main(String args[]) {
		try {
			int a = 10/0;
			System.out.println(a);
		} catch (Exception e) {
			// TODO: handle exception
			System.exit(0);
		}
		
			
		finally {
			System.out.println("i am in finally");
		}
		
		
	}
}

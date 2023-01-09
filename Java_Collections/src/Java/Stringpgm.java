package Java;

public class Stringpgm {
	

	public static void main(String[] args) {
		int count = countstr("testtesttester",'t');
		System.out.println(count);

	}

	private static int countstr(String string, char c) {
		int counter =0;
		// TODO Auto-generated method stub
		for (int i=0; i<string.length(); i++) {
			
			if(string.charAt(i)==c) {
				counter++;
			}
		
	}
	return counter;
		
	}

}

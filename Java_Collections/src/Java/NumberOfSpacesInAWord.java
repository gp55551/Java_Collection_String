package Java;

public class NumberOfSpacesInAWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "My name is Utkarsh";
		int count =0;
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}

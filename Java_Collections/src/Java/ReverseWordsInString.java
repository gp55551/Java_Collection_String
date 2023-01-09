package Java;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My name is Utkarsh";
		String temp = "";
		String words[] = str.split("\\s");
		
		for(int i=0; i<words.length; i++) {
			if(i== words.length-1) {
				temp = words[i] + temp;
				
			}
			else {
				temp = " " + words[i] + temp;
			}
		}
		System.out.println(temp);
	}

	


	
	
}

package Java;


public class CountNumberOfOccurencesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int count =	countOccurence("aaajjgbshjf",'a');
	System.out.println(count);
	}// output should be 3

	private static int countOccurence(String word, char c) {
		// TODO Auto-generated method stub
		int count = 0 ;
		for (int i=0 ; i<word.length();i++) {
			if(word.charAt(i)==c) {
				//if matches
				count++;
				
				
			}
		}
		return count;
		
	}

}

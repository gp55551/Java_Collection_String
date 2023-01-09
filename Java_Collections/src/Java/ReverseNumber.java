package Java;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * we have a number example 543
		 * output should be 345
		 * 
		 * logic
		 * 
		 * 543%10 = 3
		 * 
		 * so whenever we do any number%10, we get the last number as remainder. remember this
		 * 
		 * so we got 3
		 * 
		 * now to get 4 as next digit
		 * 543/10 = 54
		 * 54%10 = 4
		 *we got 4 as well
		 * 
		 *how to get 5 ?
		 *54/10 = 5
		 *5%10 = 5
		 *
		 *we got 5 as well
		 *
		 *now how to attach these to get number 345, see below code
		 */

		
		int number = 543;
		int reverse = 0;
		while(number != 0) {
			int digit = number %10;
			reverse = digit + reverse *10;
			number = number / 10;
			
		}
		System.out.println(reverse);
	}

}

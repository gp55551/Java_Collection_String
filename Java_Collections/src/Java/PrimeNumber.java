package Java;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Mathematical logic of prime number-
 * dividing any number other than itself and it does not give remainder as 0 is a prime number
 * 
 * for example- 11 % 2= 1
 * 11%3 = 2 and so on
 */
		boolean flag = false;
		
		int value = 11;
		for (int i=2 ; i<= value/2 ; i++) {
			//dont start i=1
			//check till half way i.e 11/2, check the remainder if it is not still 0 till 5,we can conclude 11 is a prime number
			//this is mathematical logic
			
			if(value%i==0) { //if we get 0 as remainder atleast once then its not a prime number so break it
				flag = true;
				break;
				
			}
		}
		if(flag ==true) {
			System.out.println("number is not prime");
		}
		else {
			System.out.println("prime");
		}
	}

}

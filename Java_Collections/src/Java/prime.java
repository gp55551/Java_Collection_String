package Java;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=10;
		boolean prime = true;
		for(int i=2; i<=k/2; i++) {
			if(k%i ==0) {
				prime = false;
				break;
			}
			
		}
		if(prime == true) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}
	
	
	
}

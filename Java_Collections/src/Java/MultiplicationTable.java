package Java;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//multiplication without using multiply operator
		int multiplyResult = multiply(5,10); //logic add 5 10 times
		System.out.println(multiplyResult);
	}

	public static int multiply(int i, int j) { //i has to sum j times to get result
		// TODO Auto-generated method stub
		//multiplication without using multiply operator
		int multiply = 1;
		int sum = 0;
		while(multiply<=j) {
			sum = sum+i; 
			multiply++;
		}
		return sum;
	}

}

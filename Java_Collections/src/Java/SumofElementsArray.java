package Java;

public class SumofElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create a method which accespt an array and return sum of all elements of array
		int a[] = {2,3,4,5,6,7,8};
		int sum = SumArray(a);
		System.out.println(sum);
	}
	
	//methods are not allowed to be created inside main, thats the execution block.
	//create method outside main but inside class always
	//return type can be anything in this case
	//static, because if the method is static we can call it directly without creating the object of the class
	public static int SumArray(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i<a.length; i++) {
			sum = sum +a[i];
		}
		
		return sum;
	}
	

}

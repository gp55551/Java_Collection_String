package Java;

public class MaximumNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {43,98,99,102};
		int max= a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max= a[i];
			}
		}
		System.out.println(max);
	}

}

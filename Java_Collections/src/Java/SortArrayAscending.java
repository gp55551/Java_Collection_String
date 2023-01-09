package Java;

public class SortArrayAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,4,6,1,2,0};
		int temp =0;
		for (int i=0; i<a.length; i++) {
			for(int j= i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
		
		for (int k=0; k<a.length; k++) {
			System.out.println(a[k]);
		}

	}

}

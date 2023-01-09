package Java;

public class SortArrayDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {45,76,98,12,109};
		int temp  =0;

	for (int i = 0; i<a.length ; i++) {
		for (int j=i+1; j<a.length; j++) {
			if(a[i]<a[j]) {
				temp =a[i];
				a[i]=a[j];
				a[j] = temp;
			}
		}
	}
	for (int i =0 ; i<a.length; i++) {
		System.out.println(a[i]);
	}
	}

}

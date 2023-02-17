package Java;

public class Array_ShiftZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,0, 2, 0 ,45,76,0, 0 ,0 ,98,12,109,0};
		

	// if 0 found , swap the pair through the loop
	for (int i = 0; i<a.length ; i++) {
		for (int j = i+1; j<a.length ; j++) {
			if(a[i]==0)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	for (int i =0 ; i<a.length; i++) {
		System.out.print(a[i]+" ");
	}
	}

}

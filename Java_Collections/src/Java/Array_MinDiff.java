package Java;

public class Array_MinDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MIN DIFF
		
		int a[] = { 2, 3, 10, 6, 4, 8, 1 };
		//int a[] = {1, 2, 90, 10, 110};
		
		//sorting
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] >a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j]= temp ; 
				}
			}
		}
		
		for(int i : a)
		{
			System.out.print(i+" ");
		}
		
		//find diff between pairs
		int mindiff = a[1] - a[0];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] - a[i] < mindiff) {
					mindiff = a[j] - a[i];
				}
			}
		}
		System.out.println();
		System.out.println(":min diff: "+mindiff);
	}

}

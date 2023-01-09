package Java;


public class MaxDifferenceAdjacentIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Maximum difference between adjacent index in an array
		
		int  a[] = {1,4,8,15,17};
		
		/*
		 * goal
		 * 1-4=3
		 * 4-8 = 4 
		 * 8-15 = 7
		 * 15-17 =2
		 * 
		 * output should be 7 which is the maximum difference
		 */
		int maxdiff =0;
		for(int i=0 ; i<a.length-1; i++) {
			
			if(a[i+1]-a[i]>maxdiff) {
				maxdiff = a[i+1]-a[i];
			}
			
			
		}
		System.out.println(maxdiff);
		
		
	}

}

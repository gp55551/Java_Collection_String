package Java;

public class MinimumNumberInMultiDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int abc[][] = {{2,4,5},{3,4,7}, {1,2,9}};

/*
 * the array would like below
 *  2   4    5
 *  3   4    7
 *  1   2    9
 *  
 *  always remember- outer for loop to traverse rows
 *  inner for loop to traverse columns
 */

int min = abc[0][0]; //always assume that the first value in the array is smallest and then start instead of declaring it as 0

for (int i =0; i<3; i++) {
	for (int j = 0 ; j<3 ; j++) {
		if(abc[i][j]<min) {
			
			min = abc[i][j];
			
		}
	}
	
}
System.out.println(min);



	}

}

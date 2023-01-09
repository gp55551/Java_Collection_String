package Java;

public class MaximumNumberinMultiDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][] = {{2,4,5},{3,4,7}, {1,2,9}};
		int max = abc[0][0];
		
		for(int i=0; i<abc.length;i++) {
			for(int j=0; j<abc.length; j++) {
				if(abc[i][j]>max) {
					max = abc[i][j];
				}
			}
		}
		System.out.println(max);
	}

}

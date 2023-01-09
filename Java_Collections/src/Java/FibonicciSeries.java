package Java;


public class FibonicciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fibonicci series is sum of adjacent numbers
		//for example-0 1 1 2 3 5 8 13 21...
		int a =0;
		int b= 1;
		int i=1;
		int sum =0;
		System.out.println(a);
		System.out.println(b);
		while(i<9) {//this will give us fibonicci upto 8 numbers
			sum = a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			i++;
		}
		
		////////
		
		int n=4;
		
		int m=1;
		
		for(int i1 = 1 ; i1<=n;i1++)
		{
		for(int j = 1; j<=i1 ; j++)
		{
			System.out.print(m);
			m=m+1;
		}

		System.out.println();

		}
	}
	
	
} 

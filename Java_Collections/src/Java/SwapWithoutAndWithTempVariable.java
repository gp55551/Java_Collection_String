package Java;

public class SwapWithoutAndWithTempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 5; 
int b = 8;
int temp = 0;

temp = a;   //here temp becomes 5
a=b; //a becomes 8
b=temp; //b becomes 5

System.out.println(a);
System.out.println(b);


//without using temp variable

int c=7;
int d=10;
c= c+d; //c becomes 17
d = c-d; //d becomes  7
c = c-d; //c becomes 10

System.out.println(c);
System.out.println(d);

	}

}

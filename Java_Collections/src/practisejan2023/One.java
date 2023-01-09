package practisejan2023;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(1+2+"gaurav"+2+1);
		//reverseString();
		//reverseStringwithSpaces();
		//capitaliseEvenIndexStrings();
		//CountNumberOfOccurencesInString();
		//factorial();
		fibonacci();
		
	}
	
	public static void  reverseString() {
		
		String name= "Gaurav";
		String reverse= "";
		for(int i = name.length()-1 ; i >=0;i--)
		{
			reverse = reverse + name.charAt(i);
		}
		
		System.out.println(reverse);
	}

	public static void  reverseStringwithSpaces() {
		
		String name= "Gaurav Patnaik";
		String reverse= "";
		for(int i = name.length()-1 ; i >=0;i--)
		{
			reverse = reverse + name.charAt(i);
		}
		
		System.out.println(reverse);
	}
	
	public static void  capitaliseEvenIndexStrings() {
		
		String name= "gauravpatnaik";
		String reverse= "";
		for(int i = 0 ; i < name.length();i++)
		{
			if(i%2==0)
			{
				String indexchar = name.charAt(i)+"";
				reverse = reverse + indexchar.toUpperCase();
			}
			else
			{
				reverse = reverse + name.charAt(i);
			}	
		}
		System.out.println(reverse);
	}
	
	public static void  CountNumberOfOccurencesInString() {
		
		String name= "gauravPatnaik";
		int count = 0 ;
		
		char let = 'a';
		
		for(int i = 0 ; i < name.length();i++)
		{
			if(name.charAt(i)==let)
			{
				count++;
			}
			
		}
		
		System.out.println(count);
	}
	
	public static void  factorial() {
		
		int num = 7 ; 
		int fac = 1 ; 
		while (num>0)
		{
			fac = fac * num;
			num--;
		}
		
		System.out.println(fac);
	}
	public static void  fibonacci() {
		
		int num = 10;
		int a =0 ;
		int b = 1 ;
		System.out.println(a);
		System.out.println(b);

		while(num>0)
		{
			int c = a + b;
			System.out.println(c);
			a = b;
			b= c ; 
			num--;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

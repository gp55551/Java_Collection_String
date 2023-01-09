package Java;

public class RemoveCommainString {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String str = "My ,name ,is ,Gaurav";
			String temp = "";
			String words[] = str.split(",");
			
			for(int i=0; i<words.length; i++) {
					temp = temp +words[i] ;
					
			
			}
			System.out.println(temp);
		}

	}


	
	

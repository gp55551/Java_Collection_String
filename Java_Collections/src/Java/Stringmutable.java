package Java;

public class Stringmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";
		String s2 = "hello";
		
		s.concat("world");
		System.out.println(s);
		
		
		
		//how to make mutable
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);
	}

}

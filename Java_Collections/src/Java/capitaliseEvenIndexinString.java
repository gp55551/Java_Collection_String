package Java;

public class capitaliseEvenIndexinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome";
		String temp = "";

		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				String ch = "" + str.charAt(i);
				temp = temp + ch.toUpperCase();
			} else {
				temp = temp + str.charAt(i);
			}
		}
		System.out.println(temp);
	}
}

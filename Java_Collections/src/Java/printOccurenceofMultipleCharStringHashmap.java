package Java;

import java.util.HashMap;



public class printOccurenceofMultipleCharStringHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vvv imp
		String str = "SSDRRRTTYYTYTR";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=str.length()-1 ; i>=0; i--) {
			if(!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), 1);
			}
			else {
				
				int count = hm.get(str.charAt(i));
				hm.put(str.charAt(i), ++count);
			}
		}
		System.out.println(hm);
		
		//{R=4, S=2, D=1, T=4, Y=3}
	}
}


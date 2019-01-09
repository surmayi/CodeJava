package ArrayAndArrayLists;

import java.util.Arrays;

public class CheckIfAnagram {

	public static void main(String[] args) {
		String one = "One";
		String two ="One";
		
		char one1[] = one.toCharArray();
		char two2[] = two.toCharArray();
		
		Arrays.sort(one1);
		Arrays.sort(two2);
		one = one1.toString();
		two = two2.toString();
		if(one1.length!=two2.length) {
			System.out.println("Length check failed"+false);System.exit(0);}
		else {
			for(int i = 0; i < one1.length;i++) {
				if(one1[i]!=two2[i]) {
					System.out.println("Equal check failed"+false);
					System.exit(0);;}
			}
			System.out.println(true);;
		}
	}

}

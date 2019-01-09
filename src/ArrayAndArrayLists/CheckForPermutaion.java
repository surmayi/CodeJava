package ArrayAndArrayLists;

import java.util.Arrays;

public class CheckForPermutaion {

	public static void main(String[] args) {
		
		String s = "abcd",t="cada";
		if(s.length()!=t.length())
		{
			System.out.println("Not in permutation");
			System.exit(1);
		}
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i = 0 ; i<a.length;i++) {
			if(a[i]!=b[i]) {
				System.out.println("Not in permutation");
				System.exit(1);
			}
		}
		System.out.println("In permutation");
		
	}

}

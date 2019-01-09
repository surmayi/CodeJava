package ArrayAndArrayLists;

import java.util.Calendar;

public class CheckIfStringHasAllUniqueCharactersAdvanced {

	public static void main(String[] args) {
		System.out.println(Calendar.getInstance().get(Calendar.MILLISECOND));
		String str ="abcdefgh";
		boolean flag = true;
		for(int i =0 ;i<str.length();i++) {
			if(!(i==str.lastIndexOf(str.charAt(i)))) {
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("Unique");
		else
			System.out.println("Not Unique");
		System.out.println(Calendar.getInstance().get(Calendar.MILLISECOND));
	}

}

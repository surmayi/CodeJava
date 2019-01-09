package ArrayAndArrayLists;

import java.util.Arrays;
import java.util.Calendar;

public class CheckIfStringHasAllUniqueCharactersBasic {

	public static void main(String[] args) {
		System.out.println(Calendar.getInstance().get(Calendar.MILLISECOND));
		String str = "abcdafgh";
		
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		boolean flag = true;
		for(int i =0 ;i < str.length()-1;i++)
		{
			if(arr[i]==arr[i+1])
				{flag =false;break;}
		}
		if(flag)
			System.out.println("Unique");
		else
			System.out.println("NOt unique");
		System.out.println(Calendar.getInstance().get(Calendar.MILLISECOND));
	}

}

package ArrayAndArrayLists;

public class CheckForDuplicatesBasic {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3,4,1,3};
		int[] carr = new int[arr.length];
		for(int i =0 ;i<arr.length;i++) {
			carr[arr[i]]++;
		}
		for(int i =0 ;i<carr.length;i++) {
			if(carr[i]>1)
				System.out.println(i+" is duplicate");
		}
	}

}

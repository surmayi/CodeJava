package ArrayAndArrayLists;

public class ReverseArray {

	public static void main(String[] args) {
		 int[] arr = new int[5];
		 
		 for(int i =0 ; i< arr.length;i++)
			 arr[i] = i;
		 
		 for(int i=arr.length-1, j=0;!(i==j); i--,j++) {
			  arr[i]=arr[i]+arr[j];
				 arr[j]=arr[i]-arr[j];
				 arr[i]=arr[i]-arr[j];
		 }
		 
		 for(int i = 0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }	 
	}

}

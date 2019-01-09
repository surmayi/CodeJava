package ArrayAndArrayLists;

import java.util.Random;

public class ReservoirSampling {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] arr = new int[]{1,2,3,4,1,2,3,4,5,6,7,9};
		int k = 4;
		int[] carr = new int[4];
		for(int i=0;i<k;i++) {
			carr[i] = arr[i];
		}
		
		for(int i =k;i<arr.length;i++) {
			int val = rand.nextInt(i);
			if(val<k)
				carr[val] = arr[i];
				
		}
		for(int i=0;i<k;i++) {
			System.out.println(carr[i]);
		}
	}

}

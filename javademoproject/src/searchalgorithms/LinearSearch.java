package searchalgorithms;

public class LinearSearch {
	public static void main(String[] args) {
		int searchitem=67;
		int[]arr= {12,45,67,78,89,54};
		int index=linearsearch(arr,searchitem);
		if(index==-1) {
			
			System.out.println("item "+searchitem+" not found  ");
		}
		
		System.out.println("item "+searchitem+" found at "+index);
	}

	private static int linearsearch(int[] arr, int searchitem) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchitem) {
				return i;
			}
		}
		return -1;
	}
	
}

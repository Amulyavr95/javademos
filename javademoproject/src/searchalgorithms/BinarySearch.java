package searchalgorithms;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int searchitem=1;
		int[]arr= {12,45,67,78,89,54,100};
		System.out.println("before soting"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after soting"+Arrays.toString(arr));
		int index=binarysearch(arr,searchitem);
		if(index==-1) {
			
			System.out.println("item "+searchitem+" not found  ");
		}
		
		System.out.println("item "+searchitem+" found at "+index);
	
	}

	private static int binarysearch(int[] arr, int searchitem) {
		int first=0;
		int last=arr.length-1;
		int mid=(first+last)/2;
		while(first<=last) {
			if(searchitem>arr[mid]) {
				first=mid+1;
			}else if(searchitem>arr[mid]){
				last=mid-1;
				
			}else {
				return mid;
			}
			mid=(first+last)/2;
		}
		
		return -1;
	}
}

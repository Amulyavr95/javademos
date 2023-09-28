package sortingalgorithms;

import java.util.Arrays;
import java.util.List;

public class SelectionSort {
	public static void main(String[] args) {
		int	numbers[]= {10,4,17,5,6,2,13,2};
		System.out.println("before soting"+Arrays.toString(numbers));
		System.out.println("after soting"+Arrays.toString(selectionsort(numbers)));
		

	}
	static int[]selectionsort(int[]arr){
		
		for(int i=0;i<arr.length;i++) {
			int small=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[small]) {
					small=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[small];
			arr[small]=temp;
			
		}
		
		
		
		return arr;
		}		
}

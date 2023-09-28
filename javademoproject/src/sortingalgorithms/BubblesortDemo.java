 package sortingalgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubblesortDemo {
	public static void main(String[] args) {
	int	arr[]= {10,4,17,5,6,2,13,2};
	System.out.println("before soting"+Arrays.toString(arr));
	long start=System.currentTimeMillis();
	System.out.println("after soting"+Arrays.toString(bubblesort(arr)));
	long end=System.currentTimeMillis();
	System.out.println("took " +(end-start)+" miliseconds");
	
	}
	static int[]bubblesort(int[]arr){
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	return arr;
	}		
	
}

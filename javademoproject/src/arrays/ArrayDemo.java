package arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		
		 int []arr= {10,23,4,56};
		int arr2[];
		//System.out.println(arr);
		printArray(arr);
		arr[0]=12;
		printArray(arr);
		arr[2]=new Integer(11);
		printArray(arr);
		System.out.println(arr.length);
		try{int x= arr[4];
		System.out.println(x);}
		catch(Exception e) {
			System.out.println("exception occurred"+e.getMessage());
		}
	}
	 static void printArray(int[]array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
			
		}
		System.out.println();
	}
	 
}

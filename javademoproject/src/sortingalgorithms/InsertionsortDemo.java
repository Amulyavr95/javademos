 package sortingalgorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionsortDemo {
	public static void main(String[] args) {
	
		List<Integer>numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(4);
		numbers.add(17);
		numbers.add(5);
		numbers.add(6);
		numbers.add(2);
		
	System.out.println("before soting"+numbers);
	System.out.println("after soting"+insertionsort(numbers));
	}
	
	
	static List<Integer>insertionsort(List<Integer> numbers){
		
		for(int i=1;i<numbers.size();i++)
		{ if(numbers.get(i)<=numbers.get(0)) {
			numbers.add(0,numbers.get(i));
			numbers.remove(i+1);
		}
			
		else if(numbers.get(i)<numbers.get(i-1)) {
				for(int j=1;j<i;j++) {
					
					if(numbers.get(i)<numbers.get(j)) {
						numbers.add(j,numbers.get(i));
						numbers.remove(i+1);
					}
				}
		}
		
	}
		return numbers;		
	
}
}

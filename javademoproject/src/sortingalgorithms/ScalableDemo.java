package sortingalgorithms;

public class ScalableDemo {
	public static void main(String[] args) {
		String[] arr= {"radio","tv","TV","Computer"};
		//String[] arr= {"radio"};
		mysearch(arr);
	}

	private static void mysearch(String[] arr) {
		long start=System.currentTimeMillis();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=="radio") {
				System.out.println("radio found");
				
			}
		}
		long  end= System.currentTimeMillis();
		System.out.println("took " +(end-start)+" miliseconds");
	}
	private static void mysearch2(String[] arr) {
		
				System.out.println("radio found");
	}
}

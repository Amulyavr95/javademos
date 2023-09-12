package javademoproject;

public class loopsdemo {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
			System.out.println(i);
			}
		}
		for(int i=10;i>0;i--) {
			System.out.println(i);
	
		}
		int i=0;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		int sum=0;
		for(int j=1;j<=10;j++) {
			sum+=j;
		}
		System.out.println(sum);
	}
	
}

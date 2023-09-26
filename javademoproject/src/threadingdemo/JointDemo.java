package threadingdemo;

import java.util.Scanner;

public class JointDemo {
	public static void main(String[] args) {
		
		
		Utils.printmessage("enter a number");
		Utils.printmessage("enter the value");
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		long starttime=System.currentTimeMillis();
		
		Calculator c=new Calculator(n);
		c.start();
		
		try {
			c.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Utils.printmessage("sum of first "+n+ " numbers "+c.getSum());
		long endtime=System.currentTimeMillis();
		long ttime=(endtime-starttime)/1000;
		System.out.println("total time taken="+ttime+" seconds");
		}
 
}


class Calculator extends Thread{
	
	int n;
	int sum;
	Calculator(int n){
		this.n=n;
	}
	
	public void run() {
		for(int i=1;i<=n;i++){
			this.sum+=i;
		}
	}	
	public int getSum() {
		return sum;
	}

}
package scannerdemo;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		//Scannerdemo1();
		Scannerdemo2();
		}
	
	private static void Scannerdemo2() {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		while(sc.hasNextInt()) {
			int num=sc.nextInt();
			sum+=num;
			System.out.println("enter the number");	
		}
		System.out.println("sum: 1"+sum);
	}
	private static void Scannerdemo1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id");
		int id =sc.nextInt();
		
		System.out.println("enter student name");
		String name=sc.next();
		
		System.out.println("enter student score");
		double score=sc.nextDouble();
		
		System.out.println("student details");
		
		System.out.println("id :"+id);
		System.out.println("name :"+name);
		System.out.println("score :"+score);
	}
}

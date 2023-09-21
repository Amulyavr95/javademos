package arrays;

import java.io.Serializable;

public class Arraydemo2 {
public static void main(String[] args) {
	int []a= {3,5,4,5,6,3,5,7};
	//array(a);
	//sumofarray();
	//sumofeven();
	//chararray();
	arrayofobjects();
	}

private static void array(int[] a) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==5&&a[i-1]==3) {
			a[i]=0;

		}
		System.out.print(a[i]+" ");
	}
}

 private static void sumofarray(){
	 int b[]= {1,2,3,4};
	 int sum=0;
	 for(int i:b) {
		 sum+=i;
	 }
	 System.out.println(sum);
 }
 
 private static void sumofeven(){
	 int b[]= {1,2,3,4,5,6,7};
	 int sum=0;
	 for(int i:b) {
		 if(i%2==0) {
		 sum+=i;
	 }
 }
	 System.out.println(sum);
}
 private static void chararray()
 {
	 String s1="hello world",res="";
	 char[] s2=s1.toCharArray();
	 for(char x:s2) {
		 res=x+res;
	 }
	System.out.println(res); 
 }
 
 private static void arrayofobjects() {
	 Employee[] emp=new Employee[4];
	 Employee emp1=new Employee(1, "mark", 1500, "A1234");
	 Employee emp2=new Employee(2, "john", 1800, "A1235");
	 Employee emp3=new Employee(3, "matr", 1600, "A1236");
	 Employee emp4=new Employee(4, "will", 1300, "A1237");
	 emp[0]=emp1;
	 emp[1]=emp2;
	 emp[2]=emp3;
	 emp[3]=emp4;
	 for(Employee e:emp) {
		 System.out.println(e);
	 }
 }
}
 class Employee implements Serializable{
		int id;
		String name;
		double salary;
		transient String aadharno;
		
		Employee(int id,String name,double salary,String aadharno){
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.aadharno=aadharno;
			
		}
		public String toString() {
			return this.id+"|"+this.name+"|"+this.salary+"|"+this.aadharno;
		}
}


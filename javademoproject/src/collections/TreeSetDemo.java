package collections;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



public class TreeSetDemo {
	public static void main(String[] args) {
		Set <Integer> set = new TreeSet<Integer>();
		set.add(3);
		set.add(2);
		set.add(10);
		set.add(5);
		set.add(4);
		System.out.println(set);
		
		Set <String> set1 = new TreeSet<String>();
		set1.add("william");
		set1.add("joe");
		set1.add("mark");
		set1.add("zo");
		set1.add("pertricks");
		System.out.println(set1);
		
		Set <String> set2 = new TreeSet<String>(new StringComparator1());
		set2.add("william");
		set2.add("joe");
		set2.add("mark");
		set2.add("zoe");
		set2.add("pertricks");
		System.out.println(set2);
		
		Set<Employee>emp=new TreeSet<Employee>(new StringComparator());
		emp.add(new Employee(1, "amulyaaaaaa", 1500, "A1234"));
		emp.add(new Employee(2, "anan", 1500, "A1235"));
		emp.add(new Employee(3, "ganesh", 1500, "A1236"));
		emp.add(new Employee(4, "marks", 1500, "A1237"));
		emp.add(new Employee(5, "williams", 1500, "A1238"));
		
		System.out.println(emp);
	}
}

class StringComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int l1=o1.name.length();
		int l2=o2.name.length();
		if(l1<l2) {
			return -1;
			
		}else if(l1>l2) {
			return 1;
		}else {
		return 0;
		}
		
	}
	
}

class StringComparator1 implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		int l1=str1.length();
		int l2=str2.length();
		if(l1<l2) {
			return -1;
			
		}else if(l1>l2) {
			return 1;
		}else {
		return str1.compareTo(str2);
		}
	}
	
}

class Employee implements Comparable<Employee>{
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
	@Override
	public int compareTo(Employee o) {
		
		return this.id<o.id?-1:this.id>o.id?1:0;
	}		
	
}
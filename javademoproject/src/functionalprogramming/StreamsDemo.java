package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String[] args) {
		 
		List<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
		System.out.println(list);
		List<Integer> filterdList=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(filterdList);
		List<Integer> multiplyby2=list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(multiplyby2);
		
		List<String>names=new ArrayList<String>();
		names.add("AMULYA");
		names.add("VEENA");
		names.add("ADHI");
		names.add("RANGANATHA");
		System.out.println(names);
		List<String> lowercase=names.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println(lowercase);
		
		Random ran =new Random();
		List<Integer>numlist=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			numlist.add(ran.nextInt(1,10));
		}
		System.out.println(numlist);
		System.out.println(numlist.stream().sorted().collect(Collectors.toList()));
	}
}

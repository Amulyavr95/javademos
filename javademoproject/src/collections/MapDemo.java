package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,Integer>marks=new HashMap<>();
		marks.put("amu", 100);
		marks.put("amully", 101);
		marks.put("amulya", 102);
		marks.put("amul", 103);
		marks.put("amulyaa", 10);
		
		System.out.println(marks);
		System.out.println(marks.values());
		System.out.println(marks.keySet());
		
		for(String key:marks.keySet()) {
			System.out.println(marks.get(key));
		}
		
		Map<String,Integer>mark=new LinkedHashMap<>();
		mark.put("amu", 100);
		mark.put("amully", 101);
		mark.put("amulya", 102);
		mark.put("amu", 103);
		mark.put("amulyaa", 10);
		System.out.println(mark);
	}
}

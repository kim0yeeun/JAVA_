package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("¸Ê1_1", 30);
		int val = map1.get("¸Ê1_1");
		System.out.println(val);
		
		Map<Integer, Double> map2 = new HashMap<Integer, Double>();
		map2.put(1,1.4);
		double d = map2.get(1);
		System.out.println(d);
	
		Map<String, Member> map = new HashMap<String, Member>();
		map.put("¸Ê1", new Member("¸Ê1",30));
		map.put("¸Ê2", new Member("¸Ê2",10));
		map.put("¸Ê3", new Member("¸Ê3",64));
		map.put("¸Ê4", new Member("¸Ê4",27));
		
		// System.out.println(map.get("¸Ê1"));
		// CollectionFramework.Member@5e91993f ¸â¹ö´Ï±î ¸â¹ö·Î ¹Þ¾Æ¾ßÇÑ´Ù.
		Member m = map.get("¸Ê1"); 
		System.out.println(m.getAge());
		
	}
}

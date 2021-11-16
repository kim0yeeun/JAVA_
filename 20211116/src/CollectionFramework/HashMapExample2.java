package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("��1_1", 30);
		int val = map1.get("��1_1");
		System.out.println(val);
		
		Map<Integer, Double> map2 = new HashMap<Integer, Double>();
		map2.put(1,1.4);
		double d = map2.get(1);
		System.out.println(d);
	
		Map<String, Member> map = new HashMap<String, Member>();
		map.put("��1", new Member("��1",30));
		map.put("��2", new Member("��2",10));
		map.put("��3", new Member("��3",64));
		map.put("��4", new Member("��4",27));
		
		// System.out.println(map.get("��1"));
		// CollectionFramework.Member@5e91993f ����ϱ� ����� �޾ƾ��Ѵ�.
		Member m = map.get("��1"); 
		System.out.println(m.getAge());
		
	}
}

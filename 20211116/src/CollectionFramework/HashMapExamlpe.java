package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Map Collection

public class HashMapExamlpe {
	public static void main (String[] args) {
		// Dictionary : Key �� Value �� �̷������ dic = {"a":1, "b":2} : Map 
		
		// �÷���
		List<String> list = new ArrayList<String>();
		list.add("����Ʈ1");
		
		// Map
		// Map �÷��� ����
		//     Ű       ��
		Map<String, Integer> map = new HashMap<String, Integer>();
		// ��ü ����
		map.put("Map1", 46);
		map.put("Map2", 58);
		map.put("Map3", 72);
		map.put("Map4", 35);
		map.put("Map5", 20);
		map.put("Map6", 94);
		// map������ �ߺ�Ű�� ������� �ʴ´�. ���� Ű�� ������ ���� ���������.  
		map.put("Map6", 100);
		System.out.println("map�� ũ��� : " + map.size() + "�Դϴ�.");
		System.out.println("ù ��° ���� " + map.get("Map1") + "�Դϴ�."); // get(KEY) key�� �־��ش�! 
		
		// Ű�� ������ ����, Ű�� ������ ����
		map.put("Map7", 55); // ����
		map.put("Map1", 0);  // ����
		
		
		Set<String> keySet = map.keySet(); 	// Ű�� �����ϸ� set�ڷ������� ����´�. 
										 	// �ۼ� ��¿�� ���� set���� ������
		for(String s : keySet) {
			System.out.println(s + "�� ���� " + map.get(s) + "�Դϴ�.");
		}
		

		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(map.get(key));
		}
		
		System.out.println("====================================");
		System.out.println(map.size());
		map.remove("Map1");
		System.out.println(map.size());
		
		map.clear();
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		
		
		
}
	}

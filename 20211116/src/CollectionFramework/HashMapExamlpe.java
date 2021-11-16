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
		// Dictionary : Key 와 Value 로 이루어진것 dic = {"a":1, "b":2} : Map 
		
		// 컬렉션
		List<String> list = new ArrayList<String>();
		list.add("리스트1");
		
		// Map
		// Map 컬렉션 생성
		//     키       값
		Map<String, Integer> map = new HashMap<String, Integer>();
		// 객체 저장
		map.put("Map1", 46);
		map.put("Map2", 58);
		map.put("Map3", 72);
		map.put("Map4", 35);
		map.put("Map5", 20);
		map.put("Map6", 94);
		// map에서는 중복키를 허용하지 않는다. 같은 키를 넣으면 값이 덮어씌워진다.  
		map.put("Map6", 100);
		System.out.println("map의 크기는 : " + map.size() + "입니다.");
		System.out.println("첫 번째 값은 " + map.get("Map1") + "입니다."); // get(KEY) key를 넣어준다! 
		
		// 키가 없으면 저장, 키가 있으면 수정
		map.put("Map7", 55); // 저장
		map.put("Map1", 0);  // 수정
		
		
		Set<String> keySet = map.keySet(); 	// 키를 추출하면 set자료형으로 갖고온다. 
										 	// 글서 어쩔수 없이 set으로 가져옴
		for(String s : keySet) {
			System.out.println(s + "의 값은 " + map.get(s) + "입니다.");
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

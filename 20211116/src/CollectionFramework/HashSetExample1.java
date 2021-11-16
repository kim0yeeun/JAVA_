package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//기본 자료형, String, Integer(Wrapper), 배열, class, list, set, map
public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("문자열1");			// set은 순서에 영향받지 않는다.
		set.add("문자열2");
		set.add("문자열3");
		set.add("문자열4");
									// get을 이용할 수 없다.
									// 같은 값이 들어가면?
		set.add("문자열4");			// 중복은 저장되지 않는다. 
		
		int size = set.size();
		System.out.println(size);
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String s = (String)iterator.next();
			System.out.println(s);
		}
		set.remove("문자열2");
		size = set.size();
		System.out.println(size);
		
		for(String s : set) {
			System.out.println(s);
		}
	}

}






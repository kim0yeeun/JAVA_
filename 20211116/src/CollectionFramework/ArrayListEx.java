package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("문자열1"); 			// object 타입으로 들어갔기 때문에 
		list.add("문자열2");
		list.add("문자열3");
		// 리스트는 중복되는 값이 저장된다. 
		list.add("문자열3");
		list.set(2, "수정된문자열3");
		// object로 저장된 경우 아래처럼 사용하지 않는다. 
		for (int i=0; i<list.size(); i++) {
			System.out.println((String)list.get(i));   // 스트링으로 변환해서 출력해야한다. 
		}											   // 근데 이렇게 사용 안한다.
		
		// 이렇게 사용한다. 
		for (int i=0; i<list.size(); i++) {
			String s = (String)list.get(i);
			System.out.println(s);
		}
		// 또는
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1); 									// object 타입이 아니라 int형으로 들어가니까 형변환할 필요가 없다.
		list1.add(2);
		list1.add(3);
		for (int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("=====");
		
		
		// 리스트에 있는 값을 삭제
		System.out.println("list1의 사이즈 : " + list1.size());
		list1.remove(0); // 인덱스로 삭제
		System.out.println("list1의 사이즈 : " + list1.size());
		
		System.out.println("=====");
		
		
		
		for (Object obj : list) {
			String s = (String)obj;
			System.out.println(s);
		}
		list.remove(0);
		System.out.println("list의 사이즈 : " + list.size());
		list.remove("문자열3");
		System.out.println("list의 사이즈 : " + list.size());
		list.clear();
		System.out.println("list의 사이즈 : " + list.size());
		System.out.println("list가 비어있습니까? : " + list.isEmpty());
		list.add("문자열");
		System.out.println("list가 비어있습니까? : " + list.isEmpty());
		
		/*
		 * 리스트에서는 
		 * add, remove, size, isEmpty, removeAll() 등을 알아두자
		 * 
		 */
		
	}

}

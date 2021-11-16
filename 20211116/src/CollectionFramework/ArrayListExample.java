package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// 자바 리스트는 배열의 단점을 보완해준다. 
		String str [] = {"나는","자바가","너무","좋아요."};
		System.out.println(str.length);					// 배열의 크기는 정해져있으며 유동적이지 않다. 고정되어있다. 
		str[3] = "참좋아요";
		// str[4] = ".";
		// ArrayIndexOutOfBoundsException
		System.out.println(str[3]);
		
		List list = new ArrayList();					// 리스트는 크기가 유동적이다. 배열과 똑같이 같은 타입만 저장한다.
														// 파이썬 리스트와 비슷하다. 
		list.add("문자열1");
		list.add(1);
		list.add("문자열2");
		list.add("문자열3");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		List<String> list1 = new ArrayList<String>();	// String만 넣겠다.
		list1.add("string1");
		list1.add("string2");
		for (String s : list1) {
			System.out.println(s);
		}
		
		
		System.out.println("=====");
		
		// Object 어떠한 타입이든 다 저장할 수 있다. 자료형을 구별하지 않고 사용한다. 
		int i = 10;
		Object obj1 = 10; 
		System.out.println(obj1);
		
		String str1 = "문자열";
		obj1 = "문자열";
		System.out.println(obj1);
		
		double d = 10.5;
		obj1 = 10.5;
		System.out.println(obj1);
		
		obj1 = new Calculator();
		// 모든 타입을 사용하므로 객체 생성도 가능하다.
		// obj1.setFirst(5); 불가능! 
		Calculator cal = (Calculator)obj1;  /// 강제형변환해서 사용 obj1.set뭐시기 xxxx 
		cal.setFirst(4);
		System.out.println(cal.getFirst());
		

		
	}
}


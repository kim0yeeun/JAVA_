package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// �ڹ� ����Ʈ�� �迭�� ������ �������ش�. 
		String str [] = {"����","�ڹٰ�","�ʹ�","���ƿ�."};
		System.out.println(str.length);					// �迭�� ũ��� ������������ ���������� �ʴ�. �����Ǿ��ִ�. 
		str[3] = "�����ƿ�";
		// str[4] = ".";
		// ArrayIndexOutOfBoundsException
		System.out.println(str[3]);
		
		List list = new ArrayList();					// ����Ʈ�� ũ�Ⱑ �������̴�. �迭�� �Ȱ��� ���� Ÿ�Ը� �����Ѵ�.
														// ���̽� ����Ʈ�� ����ϴ�. 
		list.add("���ڿ�1");
		list.add(1);
		list.add("���ڿ�2");
		list.add("���ڿ�3");
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
		
		List<String> list1 = new ArrayList<String>();	// String�� �ְڴ�.
		list1.add("string1");
		list1.add("string2");
		for (String s : list1) {
			System.out.println(s);
		}
		
		
		System.out.println("=====");
		
		// Object ��� Ÿ���̵� �� ������ �� �ִ�. �ڷ����� �������� �ʰ� ����Ѵ�. 
		int i = 10;
		Object obj1 = 10; 
		System.out.println(obj1);
		
		String str1 = "���ڿ�";
		obj1 = "���ڿ�";
		System.out.println(obj1);
		
		double d = 10.5;
		obj1 = 10.5;
		System.out.println(obj1);
		
		obj1 = new Calculator();
		// ��� Ÿ���� ����ϹǷ� ��ü ������ �����ϴ�.
		// obj1.setFirst(5); �Ұ���! 
		Calculator cal = (Calculator)obj1;  /// ��������ȯ�ؼ� ��� obj1.set���ñ� xxxx 
		cal.setFirst(4);
		System.out.println(cal.getFirst());
		

		
	}
}


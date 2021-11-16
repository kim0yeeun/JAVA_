package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("���ڿ�1"); 			// object Ÿ������ ���� ������ 
		list.add("���ڿ�2");
		list.add("���ڿ�3");
		// ����Ʈ�� �ߺ��Ǵ� ���� ����ȴ�. 
		list.add("���ڿ�3");
		list.set(2, "�����ȹ��ڿ�3");
		// object�� ����� ��� �Ʒ�ó�� ������� �ʴ´�. 
		for (int i=0; i<list.size(); i++) {
			System.out.println((String)list.get(i));   // ��Ʈ������ ��ȯ�ؼ� ����ؾ��Ѵ�. 
		}											   // �ٵ� �̷��� ��� ���Ѵ�.
		
		// �̷��� ����Ѵ�. 
		for (int i=0; i<list.size(); i++) {
			String s = (String)list.get(i);
			System.out.println(s);
		}
		// �Ǵ�
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1); 									// object Ÿ���� �ƴ϶� int������ ���ϱ� ����ȯ�� �ʿ䰡 ����.
		list1.add(2);
		list1.add(3);
		for (int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("=====");
		
		
		// ����Ʈ�� �ִ� ���� ����
		System.out.println("list1�� ������ : " + list1.size());
		list1.remove(0); // �ε����� ����
		System.out.println("list1�� ������ : " + list1.size());
		
		System.out.println("=====");
		
		
		
		for (Object obj : list) {
			String s = (String)obj;
			System.out.println(s);
		}
		list.remove(0);
		System.out.println("list�� ������ : " + list.size());
		list.remove("���ڿ�3");
		System.out.println("list�� ������ : " + list.size());
		list.clear();
		System.out.println("list�� ������ : " + list.size());
		System.out.println("list�� ����ֽ��ϱ�? : " + list.isEmpty());
		list.add("���ڿ�");
		System.out.println("list�� ����ֽ��ϱ�? : " + list.isEmpty());
		
		/*
		 * ����Ʈ������ 
		 * add, remove, size, isEmpty, removeAll() ���� �˾Ƶ���
		 * 
		 */
		
	}

}

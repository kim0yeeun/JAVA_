package CollectionFramework;

import java.util.ArrayList;
import java.util.List;


public class ArrayListEx1 {
	public static void main(String[] arg) {
		List list = new ArrayList();
		list.add(new Board("����1","����1","�۾���1"));
		list.add(new Board("����2","����2","�۾���2"));
		list.add(new Board("����3","����3","�۾���3"));
		list.add(new Board("����4","����4","�۾���4"));
		// ���ϴ� index�� �߰� ���� 
		list.add(3, new Board("�����ε������߰�", "�����ε������߰�", "�۾����ε������߰�"));
		for (int i=0; i<list.size(); i++) {
//			String s = (String)list.get(i);
//			��Ʈ���϶� ��������ȯ�ؼ� ���������ϱ� ���嵵 �Ȱ��� �����ͺ���
			Board b = (Board)list.get(i);
			System.out.println(b.getContent());
		}
// 			��������ȯ �ϱ� ������ Ÿ���� �������� �ʴ´�.
//			���ʸ� Ÿ�� : ��������ȯ�� �ʿ䰡 ����. 
		List<Board> list1 = new ArrayList();
		list1.add(new Board("����1","����1","�۾���1"));
		list1.add(new Board("����2","����2","�۾���2"));
		list1.add(new Board("����3","����3","�۾���3"));
		list1.add(new Board("����4","����4","�۾���4"));
		for (int i=0; i<list1.size(); i++) {
			Board b = list1.get(i);
			System.out.println(b.getContent());
			System.out.println(list1.get(i).getContent());
			
		}
	}

}

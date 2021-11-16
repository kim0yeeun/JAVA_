package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//�⺻ �ڷ���, String, Integer(Wrapper), �迭, class, list, set, map
public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("���ڿ�1");			// set�� ������ ������� �ʴ´�.
		set.add("���ڿ�2");
		set.add("���ڿ�3");
		set.add("���ڿ�4");
									// get�� �̿��� �� ����.
									// ���� ���� ����?
		set.add("���ڿ�4");			// �ߺ��� ������� �ʴ´�. 
		
		int size = set.size();
		System.out.println(size);
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String s = (String)iterator.next();
			System.out.println(s);
		}
		set.remove("���ڿ�2");
		size = set.size();
		System.out.println(size);
		
		for(String s : set) {
			System.out.println(s);
		}
	}

}






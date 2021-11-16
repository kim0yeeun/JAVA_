package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] arg) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("�̼���", 50));
		System.out.println(set.size());

		// ����� ȥ�� �̰������ߴµ� ���� ���𸣰ڵ� ����� 
		
		Iterator<Member> iterator = set.iterator();
		while (iterator.hasNext()) {
			Member m = iterator.next();
			if (m.getName().equals("�̼���")) {
				set.remove(m);
				break;
			}
		}
		System.out.println(set.size());
		System.out.println("==========");
		
		for (Member m : set) {
			if (m.getName().equals("ȫ�浿")) {
				set.remove(m);
				break;
			}
			
		}
		System.out.println(set.size());
		
		set.clear();
		System.out.println(set.isEmpty());
		
	}

}

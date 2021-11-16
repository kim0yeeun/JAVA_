package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] arg) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("È«±æµ¿", 30));
		set.add(new Member("ÀÌ¼þ¹«", 50));
		System.out.println(set.size());

		// °­»ç´Ô È¥ÀÚ ÀÌ°ÍÀú°ÍÇß´Âµ¥ ³ª´À ¤¤¸ð¸£°Úµû ¹¹°í¿ä 
		
		Iterator<Member> iterator = set.iterator();
		while (iterator.hasNext()) {
			Member m = iterator.next();
			if (m.getName().equals("ÀÌ¼þ¹«")) {
				set.remove(m);
				break;
			}
		}
		System.out.println(set.size());
		System.out.println("==========");
		
		for (Member m : set) {
			if (m.getName().equals("È«±æµ¿")) {
				set.remove(m);
				break;
			}
			
		}
		System.out.println(set.size());
		
		set.clear();
		System.out.println(set.isEmpty());
		
	}

}

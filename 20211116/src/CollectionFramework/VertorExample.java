package CollectionFramework;


import java.util.List;
import java.util.Vector;

public class VertorExample {
	public static void main (String[] args) {
		List<Board> list = new Vector<Board>();
		list.add(new Board("����1","����1","�۾���1"));
		list.add(new Board("����2","����2","�۾���2"));
		list.add(new Board("����3","����3","�۾���3"));
		list.add(new Board("����4","����4","�۾���4"));
		list.add(1, new Board("����5","����5","�۾���5"));
		for (int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getContent());
		}
		System.out.println(list.size());
		list.remove(2);
		list.remove(3);
		System.out.println(list.size());

	}
}

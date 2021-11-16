package CollectionFramework;

import java.util.ArrayList;
import java.util.List;


public class ArrayListEx1 {
	public static void main(String[] arg) {
		List list = new ArrayList();
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		// 원하는 index에 추가 가능 
		list.add(3, new Board("제목인덱스로추가", "내용인덱스로추가", "글쓴이인덱스로추가"));
		for (int i=0; i<list.size(); i++) {
//			String s = (String)list.get(i);
//			스트링일때 강제형변환해서 가져왔으니까 보드도 똑같이 가져와보자
			Board b = (Board)list.get(i);
			System.out.println(b.getContent());
		}
// 			강제형변환 하기 싫으면 타입을 적어주지 않는다.
//			제너릭 타입 : 강제형변환할 필요가 없다. 
		List<Board> list1 = new ArrayList();
		list1.add(new Board("제목1","내용1","글쓴이1"));
		list1.add(new Board("제목2","내용2","글쓴이2"));
		list1.add(new Board("제목3","내용3","글쓴이3"));
		list1.add(new Board("제목4","내용4","글쓴이4"));
		for (int i=0; i<list1.size(); i++) {
			Board b = list1.get(i);
			System.out.println(b.getContent());
			System.out.println(list1.get(i).getContent());
			
		}
	}

}

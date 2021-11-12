
public class MemberTest {

	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member("이숭무");
		Member m4 = new Member(10,17.5,"이상범");
		Member m5 = new Member(175.5,20,"박준현");

		/*
		 * 코드작성
		 */
		String name = m2.getName();
		System.out.println(name);
		
		/*
		 * 코드작성
		 */	
		double height = m2.getHeight();
		System.out.println(height);
		
		m3.setAge(50);
		m3.setHeight(176.5);
		int age = m3.getAge();
		height = m3.getHeight();
		System.out.println(age);
		System.out.println(height);
		
	}
}

// 알트엔터 (프로젝트날짜에서 오른쪽키 properties -> location에 화살표(문서)이미지 누르면 폴더열림)


public class Ex_06test {

	public static void main(String[] args) {
	
		Ex_06 ex06 = new Ex_06(); // 객체 생성 
		// 멤버 필드의 초기화 
		ex06.setData("이숭무", 30, 187.4);
		String name = ex06.getName();
		System.out.println(name);
		

		// 객체 생성과 동시에 멤버 필드의 초기화를 하려면? 생성자 사용 
		// Ex_06_1 ex06_1 = new Ex_06_1(); 생성자이므로 값 줘야한다. -> 받는쪽에선느 void삭제 
	
		Ex_06_1 ex06_1 = new Ex_06_1("이상범", 17, 175.4);
		// 객체생성시에 생성자가 자동으로 실행된다. 
		System.out.println(ex06_1.getAge());
		
	}

}

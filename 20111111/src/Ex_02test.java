
public class Ex_02test {

	public static void main(String[] args) {
		Ex_02 ex01 = new Ex_02(10,20);	// final 변수는 생성자를 통해 초기화할 수 있지만
		// ex01.first = 20;				   final 변수의 값은 변경할 수 없다. 
		Ex_02 ex02 = new Ex_02(30,40);
		System.out.println(ex01.first);
		System.out.println(ex02.first);
		
		// final 값을 변경할 수는 없지만 instance마다 값을 별개로 만들어줄 수는 있다. 
	}

}

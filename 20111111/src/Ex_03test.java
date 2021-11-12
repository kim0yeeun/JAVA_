import java.util.Scanner;

public class Ex_03test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Ex_03.name);
		Ex_03.name="이장범";
		System.out.println(Ex_03.name);
		
		// final변수는 객체마다 갑을 초기화 할 수 있다. 단, 한 번 초기화를 하면 변경할 수 없다. 
		Ex_03 ex01 = new Ex_03(20,30);
		Ex_03 ex02 = new Ex_03(50,20);
		System.out.println(ex01.getVal1());
		System.out.println(ex02.getVal1());
		
		System.out.println("=====");
		
		// 상수를 사용하는 이유는 모든 객체에서 변경되지 않은 동일한 값을 사용하기 위해서이다. 
		System.out.println(ex01.first);
		System.out.println(ex01.second);
		System.out.println(ex02.first);
		System.out.println(ex02.second);
		// ex01.first = 10; 값 변경 불가 
		System.out.println(ex01.getFirst());
		System.out.println(ex01.getSecond());
	}

}

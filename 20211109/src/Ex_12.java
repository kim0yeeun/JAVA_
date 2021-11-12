
public class Ex_12 {
	public static void main (String[]args) {
		// 6단 출력
		for (int i = 1; i <= 9; i++) {
			System.out.println("6*"+i+"="+6*i);
		}
		// 8단 출력 
		for (int i = 1; i <= 9; i++) {
			System.out.println("8*"+i+"="+8*i);
		}
		
		gugu(3);  // argument 인자 
		gugu(5);
		System.out.println(add(1,5));
		System.out.println(add(10,72));
		int result = add(20,4);
		System.out.println(result);
		int result1 = add(20,6);
		System.out.println(result1);
		// 변수를 계속 선언해야하는가? -> 클래스 만들어서 쓸 때마다 불러오기 
		
	}
	// 반복적으로 사용하는 코드가 있을 경우 함수로 작성하면 편하다. 
	//                           dan : parameter 매개변수
	public static void gugu (int dan) {
		for (int i = 1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	public static int add (int a, int b) {
		return a+b;
	}
	
	
	

}

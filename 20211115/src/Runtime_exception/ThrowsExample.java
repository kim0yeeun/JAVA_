package Runtime_exception;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			test(); // 호출함수 
		}catch (ArithmeticException e) {
			System.out.println(0);
			
		}
	}
	/// 호출 함수쪽으로 예외를 돌려줄 때에는 throws 연산자를 사용해야 한다. 
	public static void test() throws ArithmeticException { // ArithmeticException 예외를 throws 던짐 
														   // 호출 함수 쪽으로 예외를 돌리게 만드렁준다. 
		int i = 2;
		int j = 0;
		System.out.println(i/j);
	}

}

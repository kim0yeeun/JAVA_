package Final_test;

public class Ex_02 extends Ex_01{
	public int sub() {
		return first - second;
	}
	public int mul() {
		return first * second;
	}
}
	
//	@Override						// final 메서드는 상속이 잘 되지만 오버라이드 할 수 없다. 
//	public int div() {
//		if (second == 0) {
//			System.out.println("분모가 0입니다.");
//			return 0;
//		}else {
//			return first / second;
//		}
//		
//	}

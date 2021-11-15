package Runtime_exception;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		Point_ point = null; // Ponint_ point = new Point_ 라고 하지 않으면 객체 생성되지 않음
		try{
			point.print();
			// System.out.println("프로그램이 정상적으로 실행 중입니다.");
		}catch(NullPointerException e) {
			point = new Point_();
			point.print();
			// System.out.println("프로그램이 정상적으로 실행 중입니다.");
		}finally {
			System.out.println("프로그램이 정상적으로 실행 중입니다.");
			// try 든 catch 든 항상 실행이 되는 코드 
		}
		
	}

}
class Point_ {
	public void print() {
		System.out.println("출력");
	}
}
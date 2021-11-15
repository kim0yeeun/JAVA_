package Runtime_exception;

public class NullPointException {

	public static void main(String[] args) {
		// Point point = new Point();
		Point point = null; // 1. 객체가 생성되지 않았다는 뜻
		try {
			point.print();
		}catch (NullPointerException e) {
			point = new Point();
			point.print();
		}
	}

}
class Point{
	public void print() {
		System.out.println("출력");
	}
}

// 1.  NullPointerException 발생! 


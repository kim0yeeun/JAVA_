package Runtime_exception;

public class NullPointException {

	public static void main(String[] args) {
		// Point point = new Point();
		Point point = null; // 1. ��ü�� �������� �ʾҴٴ� ��
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
		System.out.println("���");
	}
}

// 1.  NullPointerException �߻�! 


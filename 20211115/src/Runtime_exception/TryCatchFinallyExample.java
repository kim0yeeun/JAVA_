package Runtime_exception;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		Point_ point = null; // Ponint_ point = new Point_ ��� ���� ������ ��ü �������� ����
		try{
			point.print();
			// System.out.println("���α׷��� ���������� ���� ���Դϴ�.");
		}catch(NullPointerException e) {
			point = new Point_();
			point.print();
			// System.out.println("���α׷��� ���������� ���� ���Դϴ�.");
		}finally {
			System.out.println("���α׷��� ���������� ���� ���Դϴ�.");
			// try �� catch �� �׻� ������ �Ǵ� �ڵ� 
		}
		
	}

}
class Point_ {
	public void print() {
		System.out.println("���");
	}
}
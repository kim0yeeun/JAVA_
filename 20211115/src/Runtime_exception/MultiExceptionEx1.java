package Runtime_exception;

public class MultiExceptionEx1 {
	public static void main(String[] args) {
		int data1 = 0;
		int data2 = 0;
		try {
			data1 = Integer.parseInt(args[0]);
			data2 = Integer.parseInt(args[1]);
			System.out.println(data1);
			System.out.println(data2);
			System.out.println("���� �� : " + data1/data2);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�Է°��� 2���� �ʿ��մϴ�.");
			//  �� ���� ���� ������ ��� ������ �׳� ó���ҷ��� �ϸ� Exception �� �����ָ� �ȴ�. 
		}catch(Exception e) {
			if (data2==0) {
				System.out.println(0);
			}else {
				System.out.println("���� �� : " + data1/data2);
			}
		}
		
	}

}
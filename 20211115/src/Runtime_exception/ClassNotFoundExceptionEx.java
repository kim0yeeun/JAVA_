package Runtime_exception;

public class ClassNotFoundExceptionEx {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.util.List1");
			System.out.println("Ŭ������ �ֽ��ϴ�");
		}catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �����ϴ�");
			e.printStackTrace(); // ������.�����޼�������ض�
								 // �����޼����� ����� ������ ���α׷��� ����� ���� �ƴϴ�. �Ʒ��� + ��°���
			// �����ڰ� ��� �������� Ȯ���ϱ� ���� �ڵ� 
		}
		System.out.println("���α׷��� ������� �ʾҽ��ϴ�.");
	}

}

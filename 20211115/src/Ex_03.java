
public interface Ex_03 {
	// ���
	static final int FIRST = 10;
	// �߻� �޼��� -> �������̵��ؼ� ���
	public void method01();
	// �������̽��� �����ڰ� ����.
	// �Ϲ� �޼��尡 ����. // ����ʵ� ����
	// �޼��尡 �ϴ� ������ �ܺηκ��� ����ʵ忡 ���� ���޹ްų�
	// ����ʵ忡 �ִ� ���� �ܺο� �����ϴ� ���̴�. 
	default void method02() {
		System.out.println("Default-method");
		System.out.println("����Ʈ �޼���� ���ǵǾ� �־�� �մϴ�.");
	}
	static void method03() {
		System.out.println("Static-method");
		System.out.println("default�޼���� static�޼���� Java8 �������� �߰��Ǿ����ϴ�.");
	}

}


public class Ex_02 extends Ex_01{
	public void method02() {
		// �߻� �޼��尡 �ִ� Ŭ������ ��ü ������ �� �� ����.
		// Ex_01 ex01 = new Ex_01(12);
		// �׷��� Ȯ���ؼ� ����ؾ��Ѵ�. 
	}
	
	@Override
	public void method01() {
		// Ȯ���ؼ� ����ϴ� �߻�޼���� �������̵��ؼ� �������ؾ��Ѵ�.
		System.out.println("Ex_02-method");
	}
	// �θ� Ŭ������ �����ڰ� ������ �ڽ�Ŭ������ ���� �����ϱ� ���� super�� ����Ѵ�. 
	public Ex_02(int first) {
		super(first);
	}
}


public abstract class Ex_01 {		// �߻�Ŭ���� ����
	// ��� �ʵ�
	int first;
	// ������
	public Ex_01(int first) {
		this.first = first;
	}
	// �߻� �޼��� : �ƹ��͵� ���ǵǾ� ���� ���� �޼��� 
	public abstract void method01();
	// �Ϲ� �޼���
	public void method02() {
		System.out.println("Ex_01-method");
	}

}

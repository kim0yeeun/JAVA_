package default_method;

public class ClassC extends ClassA{
	public void method04() {
		System.out.println("ClassC-method04");
	}

	@Override
	// �߻� �޼���� ������ Override
	public void method01() {
		System.out.println("ClassC-method01");
	}
	@Override
	// �Ϲ� �޼��嵵 �������̵� �ߴ�. -> ��ӹ��� �Ϲݸ޼��带 �������̵� �� ���� �ְ� �� �� ���� �ִ�.
	// �̷��� �������̵带 �ص��ǰ� ���ص��Ǵ� �޼��尡 �ʿ��� ��쿣 ������ �߻�Ŭ������ �Ἥ ����ߴ�. (java7 ��������)
	// �׷��� java8 �������ʹ� �������̽����� default �޼��带 ������� ! 
	// -> MyInterface ���� 
	
	public void method02() {
		System.out.println("ClassC-method02");
	}

}

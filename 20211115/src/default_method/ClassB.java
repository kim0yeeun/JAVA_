package default_method;

public class ClassB extends ClassA {
	public void method03() {
		System.out.println("ClassB-method03");
	}
	@Override
	// ��ӹ��� classA�� �ִ� �Ϲ� �޼���� �������̵� ���� �ʾƵ� �ȴ�. 
	// �߻� �޼��常 Override �ؾ߸��Ѵ�. 
	public void method01() {
		System.out.println("ClassB-method01");
	}
}

package default_method_extends;

public interface ChildInterface3 extends ParentInterface{
	public void method3();
	@Override
	public void method2();
	// default �޼��带 �߻�޼���� �������̵� �����ν� 
	// ��ӹ��� default �޼��带 �� �������ϵ��� �����. 
	// childinterface3 �� ��ӹ����� method2�� �� �������ؾ��Ѵ�. 
}

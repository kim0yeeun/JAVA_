package abstract_class;

///// �߻� Ŭ���� 
// 1. �߻� Ŭ������ ������ ����ؼ� ����ϰ�
// 2. �߻� �޼��带 �������ؼ� ����ؾ��Ѵ�.
public class SmartPhone extends Phone{
	public SmartPhone(String owner) {
		super(owner);
	}
	// �ڽ� Ŭ������ �߻�ȭ x
	// �߻� Ŭ������ ��ӹ����� �߻�޼��带 ������������Ѵ�. 
	
	@Override
	public void turnOn() {
		System.out.println("�ڵ��� ������ ŵ�ϴ�.");
		
	}
	@Override
	public void turnOff() {
		System.out.println("�ڵ��� ������ ���ϴ�.");
		
	}				
	
	

}

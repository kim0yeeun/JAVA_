package abstract_class;

public abstract class Phone {				// �θ� Ŭ������ �߻�ȭ��Ŵ : �߻�Ŭ���� 
	public String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	public abstract void turnOn();			// abstract : �߻�����, �ϼ��Ǿ��������� 
	public abstract void turnOff();			// �߻�ȭ 
}


//// �߻�Ŭ���� : �߻�޼��带 �����ִ� Ŭ��
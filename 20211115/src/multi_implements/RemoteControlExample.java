package multi_implements;

public class RemoteControlExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		// �θ� �� ���̱� ������ �ΰ��� ��� ������ �� �ִ�.
		Searchable sc = tv;
		RemoteControl rc = tv;
		// �θ� ����� ��� �θ� �ִ� �͸� ��� ����
		sc.search("�̼���");
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(-1);
		
		// �ڽ��� ����� ��� ��ӹ��� ��� �� ��� ����
		tv.search("�̻��");
		tv.turnOn();
		tv.setVolume(7);
		tv.turnOff();

	}

}

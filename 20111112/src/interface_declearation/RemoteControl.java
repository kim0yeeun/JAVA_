package interface_declearation;

public interface RemoteControl {
	// �������̽��� ������x(��ü����x), �ʵ�x, �Ϲݸ޼���x 
	
	// ���
	int MAX_VOULME = 10;
	int MIN_VOULME = 0;
	
	// �߻� �޼���
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//Java8 �������� �߰��� ��
	// ����Ʈ �޼���
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	// ���� �޼���
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}

}

package interface_declearation;

// �͸� ���� ��ü 

public class RemoteControlNoNameExample {					// ��ӹ��� �ʰ� �����ϰڴ�!
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			int vol;
			@Override
			public void turnOn() {
				System.out.println("cd �� ŵ�ϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("cd �� ���ϴ�.");
			}
			@Override
			public void setVolume(int volume) {
				if (volume > RemoteControl.MAX_VOULME) {
					vol = RemoteControl.MAX_VOULME;
				}else if (volume < RemoteControl.MIN_VOULME) {
					vol = RemoteControl.MIN_VOULME;
				}else {
					vol = volume;
				}
				System.out.println("���� cd ������ "+vol);
				
				
			}
		};
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(13);
		rc.setVolume(-11);
		rc.setVolume(7);
	}

}
// �������̽��� �������ؼ� ����ϴ� 

package interface_declearation;

// interface�� �߻� �޼���� �̷���� �����Ƿ� �����ؼ� ����Ѵ�. 
public class Audio implements RemoteControl {
	// �ʵ� 
	private int volume;
	
	// �߻� �޼���
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOULME) {
			this.volume = RemoteControl.MAX_VOULME;
		}else if(volume < RemoteControl.MIN_VOULME) {
			this.volume = RemoteControl.MIN_VOULME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� Audio ���� : " + volume);
	}
	

}

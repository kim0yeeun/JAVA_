package multi_implements;

public class RemoteControlNoNameExample {
	// �͸� ���� : ��ӵ� Ŭ������ ���� ����ϰڴ�. �� Ŭ������ ����� ���� �ʰڴ�. 
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			int vol;
			@Override
			public void turnOn() {
				System.out.println("TV_On");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV_Off");
			}
			
			@Override
			public void setVolume(int volume) {
				if(vol > RemoteControl.MAX_VOLUME) {
					this.vol = RemoteControl.MAX_VOLUME;
					System.out.println("������ �ִ밪�� 10�Դϴ�.");
				}else if (vol < RemoteControl.MIN_VOLUME) {
					this.vol = RemoteControl.MIN_VOLUME;
					System.out.println("������ �ּҰ��� 0�Դϴ�.");
				}else {
					this.vol = volume;
				}
				System.out.println("���� TV ���� : "+ vol);
			}
		}; // �ݷ� ��� �� �Ϲ����� ��ü���� + �������ϴϱ� {} �� �Ŀ� �ݷ� �� ! 
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(13);
		rc.setVolume(-11);
		rc.setVolume(7);
		
	}
	

}

package interface_declearation;

// 익명 구현 객체 

public class RemoteControlNoNameExample {					// 상속받지 않고 구현하겠다!
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			int vol;
			@Override
			public void turnOn() {
				System.out.println("cd 를 킵니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("cd 를 끕니다.");
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
				System.out.println("현재 cd 볼륨은 "+vol);
				
				
			}
		};
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(13);
		rc.setVolume(-11);
		rc.setVolume(7);
	}

}
// 인터페이스를 재정의해서 사용하는 

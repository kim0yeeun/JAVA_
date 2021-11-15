package multi_implements;

public class RemoteControlNoNameExample {
	// 익명 구현 : 상속된 클래스명 없이 사용하겠다. 즉 클래스에 상속을 하지 않겠다. 
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
					System.out.println("볼륨의 최대값은 10입니다.");
				}else if (vol < RemoteControl.MIN_VOLUME) {
					this.vol = RemoteControl.MIN_VOLUME;
					System.out.println("볼륨의 최소값은 0입니다.");
				}else {
					this.vol = volume;
				}
				System.out.println("현재 TV 볼륨 : "+ vol);
			}
		}; // 콜론 찍는 게 일반적인 객체생성 + 제정의하니까 {} 한 후에 콜론 꼭 ! 
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(13);
		rc.setVolume(-11);
		rc.setVolume(7);
		
	}
	

}

package interface_declearation;

public interface RemoteControl {
	// 인터페이스는 생성자x(객체생성x), 필드x, 일반메서드x 
	
	// 상수
	int MAX_VOULME = 10;
	int MIN_VOULME = 0;
	
	// 추상 메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//Java8 버전부터 추가된 것
	// 디폴트 메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	// 정적 메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}

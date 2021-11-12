package multi_implement;

public class SmartTelevision implements RemoteControl,Searchable {	// 인터페이스"들"을 구현한다! 의 의미에서 implement"s"
	 																// 클래스와 클래스는 다중상속이 안되지만 클래스와 인터페이스 간의 다중상속은 된다.
	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+ volume);
	}

}

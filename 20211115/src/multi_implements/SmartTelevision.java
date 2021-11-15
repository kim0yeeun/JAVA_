package multi_implements;

										// 다중 상속 : 인터페이스는 다중 상속이 가능하다.
public class SmartTelevision implements RemoteControl,Searchable{
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
		if(volume > RemoteControl.MAX_VOLUME) {			// 상수는 클래스명.상수명
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+ volume);
	
	}
}

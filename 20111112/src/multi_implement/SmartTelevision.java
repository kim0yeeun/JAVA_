package multi_implement;

public class SmartTelevision implements RemoteControl,Searchable {	// 인터페이스"들"을 구현한다! 의 의미에서 implement"s"
	 																// 클래스와 클래스는 다중상속이 안되지만 클래스와 인터페이스 간의 다중상속은 된다.
	@Override
	public void search(String url) {
	
	}

	@Override
	public void turnOn() {
	
	}

	@Override
	public void turnOff() {
	
	}

	@Override
	public void setVolume(int volume) {
	}

}

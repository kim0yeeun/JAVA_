package multi_implements;

public class RemoteControlExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		// 부모가 두 개이기 때문에 두개에 모두 대입할 수 있다.
		Searchable sc = tv;
		RemoteControl rc = tv;
		// 부모를 사용할 경우 부모에 있는 것만 사용 가능
		sc.search("이숭무");
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(-1);
		
		// 자식을 사용할 경우 상속받은 모든 것 사용 가능
		tv.search("이상범");
		tv.turnOn();
		tv.setVolume(7);
		tv.turnOff();

	}

}

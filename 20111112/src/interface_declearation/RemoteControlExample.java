package interface_declearation;

public class RemoteControlExample {

	public static void main(String[] args) {
//		Audio audio = new Audio();
//		Television television = new Television();
// 		하나씩 객체를 만들 필요 없다. 
		
		RemoteControl r; 			// 하나의 리모콘을 이용해서 Audio 와 TV 를 사용할 수 있다. 
		r = new Audio();
		r.turnOn();
		r.turnOff();
		
		r = new Television();
		r.turnOn();
		r.turnOff();
	}
//									// 인터페이스의 " 다형성 "
	
}

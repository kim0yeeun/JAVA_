package field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.Run();
		myCar.backLeftTire = new KumhoTire(); // 뒷바퀴가 터졌당! 한국타이어였는데 금호타이어로 바꿀 수 있음.
		myCar.frontRightTire = new HankookTire(); //앞바퀴가 터졌당! 금호타이어였는데 한국타이어로 바꿀 수 있음.
		// 다형성 이라고한다.
	}

}

package field_polymorphism;

public class Car {
	// 부모 변수에 자식 객체를 대입시킨다. -> 자동형 변환 
	// Tire frontLeftTire = new Tire(); // 인터페이스는 객체 생성x
	Tire frontLeftTire = new KumhoTire();
	Tire backLeftTire = new KumhoTire();
	Tire frontRightTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	// 여러종류를 대입시킬 수 있는 것을 다형성 이라고 한다.

	void Run () {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}

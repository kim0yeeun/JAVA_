package polymorphism;

public class Car {
	Tire frontLeftTire = new Tire("앞왼쪽",6);
	Tire frontRightTire = new Tire("앞오른쪽",2);
	Tire backLeftTire = new Tire("뒤왼쪽",3);
	Tire backRightTire = new Tire("뒤오르쪽",4);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		// 컨트롤 하고 roll에 마우스 왼쪽 누르면 roll 부모 클래스로 넘어간다.
		if (frontLeftTire.roll()==false) 	{ stop();return 1;} 	// 앞왼쪽 바퀴가 터졌음을 의미하는 1
		if (frontRightTire.roll()==false) 	{ stop();return 2;} 	// 앞오른쪽 바퀴가 터졌음을 의미하는 2
		if (backLeftTire.roll()==false)		{ stop();return 3;} 	// 뒤왼쪽 바퀴가 터졌음을 의미하는 3
		if (backRightTire.roll()==false)	{ stop();return 4;}		// 뒤오른쪽 바퀴가 터졌음을 의미하는 4
		
		return 0;
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}

package field_polymorphism;

public class Car {
	// �θ� ������ �ڽ� ��ü�� ���Խ�Ų��. -> �ڵ��� ��ȯ 
	// Tire frontLeftTire = new Tire(); // �������̽��� ��ü ����x
	Tire frontLeftTire = new KumhoTire();
	Tire backLeftTire = new KumhoTire();
	Tire frontRightTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	// ���������� ���Խ�ų �� �ִ� ���� ������ �̶�� �Ѵ�.

	void Run () {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}

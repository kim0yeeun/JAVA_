package field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.Run();
		myCar.backLeftTire = new KumhoTire(); // �޹����� ������! �ѱ�Ÿ�̾�µ� ��ȣŸ�̾�� �ٲ� �� ����.
		myCar.frontRightTire = new HankookTire(); //�չ����� ������! ��ȣŸ�̾�µ� �ѱ�Ÿ�̾�� �ٲ� �� ����.
		// ������ �̶���Ѵ�.
	}

}

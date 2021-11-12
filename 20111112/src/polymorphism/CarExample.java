package polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		for (int i=1; i<=5; i++) {
			int problemLocation = car.run(); // Ÿ�̾� ���� ��ġ 1,2,3,4 �� �ϳ��� ����´�. 
			switch(problemLocation) {
			case 1 : 
				System.out.println("�տ��� HankookTire ��ü");
				// car.frontLeftTire = new Tire("�տ���",6); //Tire = Hankook �����ϴ�. ������! 
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2 :
				System.out.println("�տ����� KumhoTire ��ü");
				car.frontRightTire = new KumhoTire("�տ�����", 13);
				break;
			case 3 : 
				System.out.println("�ڿ��� HankookTire ��ü");
				car.backLeftTire = new HankookTire("�ڿ���", 14);
				break;
			case 4 : 
				System.out.println("�ڿ����� KumhoTire ��ü");
				car.backRightTire = new HankookTire("�ڿ�����", 17);
				break;
			}
			
			// Ÿ�̾� �ϳ��� �������� ���¸� ���� �� �ִ�. : ������ 
			// �������� ���� 1. �ڽ��� �θ�Ŭ������ ��� 2. �θ� �ڽ��� ���� 
		}
	}

}

package method_polymorphism;

public class ___DriverTest {

	public static void main(String[] args) {
		___Driver driver = new ___Driver();
		___Bus bus = new ___Bus();
		___Taxi taxi = new ___Taxi();
		// ___Vehicle vehicle = new ___Vehicle();			//  �߻� Ŭ������ ��ü ���� �ȵ�
		// vehicle.run();
		
		driver.drive(bus);
		driver.drive(taxi); // �Ű������� ������ 
	}
}
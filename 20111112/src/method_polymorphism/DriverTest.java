package method_polymorphism;

public class DriverTest {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle vehicle = new Vehicle();			// �θ� Ŭ������ ��ü ���� ����. �߻�ȭ�θ�Ŭ������?
		
		vehicle.run();
		driver.drive(bus);
		driver.drive(taxi); // �Ű������� ������ 
	}

}

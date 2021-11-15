package method_polymorphsim;

public class DriverExample {

	public static void main(String[] args) {
		// 1. ���� ���� �ý� ���� ��ü�� ���� �� ���� ������
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		bus.run();
		taxi.run();
		
		// 2. �������̽��� ����ؼ� Vehicle�̶�� ������ �θ�� ����ؼ� 
		// �����ؼ� ����� ���� �ִ�. 
		Vehicle v = bus;
		v.run();				// ����		
		v = taxi;
		v.run();				// �ý� 
		
		// 3. ����̺� ��� Ŭ������ ���� ��� (run�� �ݺ������� ����ϴϱ� run�� �����ִ� Ŭ������ ����)
		Drive driver = new Drive();
		driver.drive(taxi);
		driver.drive(bus);
		
		// 4. ���� Ŭ���� ���� ����̺� ��� �Լ��� ������ ��� (run�� �ݺ������� ����ϴϱ� run�� �����ִ� �Լ��� ����)
		drive(bus);
		drive(taxi);
	}
	public static void drive(Vehicle v) {
		v.run();
	}

}

package casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); // �ڵ�����ȯ
		vehicle.run(); // �θ� ������ ���� ��ü�� �����߱� ������ run�� ����� �����ϴ�.
					   // �ڽ� Ŭ������ ���ǵǾ� �ִ� üũ���� ����� �� ����. ��� �ؾ��ϴ°�!
		Bus bus = (Bus)vehicle; // ��������ȯ
		// �θ� �ڽĿ� �����Ϸ��� "(�ڽ�Ŭ������)�θ�ü" �̷��� ����ؾ� �Ѵ�.
		// �ڽ� ��ü�� �ִ� ���� ��� ����� �� �ִ�.
		// �θ�κ��� ��ӹ��� �͵� ����� �����ϴ�.
		bus.checkFare();
		bus.run();
	}

}

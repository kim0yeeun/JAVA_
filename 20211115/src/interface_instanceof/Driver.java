package interface_instanceof;

public class Driver {
	public void d(Vehicle vehicle) {
		if (vehicle instanceof Bus) {		// vehicle �� Bus�� ������� ���̳�?
											// instanceof : ��ü�� Ŭ������ ���� �� ��� 
			// vehicle ��ü�� Bus Ŭ������ ������� ��ü�Դϱ�?
			// instanceof�� ������� true, false => boolean���� ��ȯ 
			Bus bus = (Bus)vehicle;		// ���� ��ü�̸� ��������ȯ�� �ؼ� 
			bus.checkFare();			// üũ�� ��������. 
		}
		vehicle.run();
	}

}

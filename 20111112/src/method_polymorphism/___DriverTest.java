package method_polymorphism;

public class ___DriverTest {

	public static void main(String[] args) {
		___Driver driver = new ___Driver();
		___Bus bus = new ___Bus();
		___Taxi taxi = new ___Taxi();
		// ___Vehicle vehicle = new ___Vehicle();			//  추상 클래스로 객체 생성 안됨
		// vehicle.run();
		
		driver.drive(bus);
		driver.drive(taxi); // 매개변수의 다형성 
	}
}
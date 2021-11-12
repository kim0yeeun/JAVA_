package method_polymorphism;

public class DriverTest {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle vehicle = new Vehicle();			// 부모 클래스로 객체 생성 가능. 추상화부모클래스는?
		
		vehicle.run();
		driver.drive(bus);
		driver.drive(taxi); // 매개변수의 다형성 
	}

}

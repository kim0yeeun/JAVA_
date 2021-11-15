package method_polymorphsim;

public class DriverExample {

	public static void main(String[] args) {
		// 1. 버스 따로 택시 따로 객체를 만들어서 할 수도 있지만
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		bus.run();
		taxi.run();
		
		// 2. 인터페이스를 사용해서 Vehicle이라는 변수를 부모로 사용해서 
		// 대입해서 사용할 수도 있다. 
		Vehicle v = bus;
		v.run();				// 버스		
		v = taxi;
		v.run();				// 택시 
		
		// 3. 드라이브 라는 클래스를 만들어서 사용 (run을 반복적으로 사용하니까 run을 갖고있는 클래스를 생성)
		Drive driver = new Drive();
		driver.drive(taxi);
		driver.drive(bus);
		
		// 4. 같은 클래스 내에 드라이브 라는 함수를 선언할 경우 (run을 반복적으로 사용하니까 run을 갖고있는 함수를 생성)
		drive(bus);
		drive(taxi);
	}
	public static void drive(Vehicle v) {
		v.run();
	}

}

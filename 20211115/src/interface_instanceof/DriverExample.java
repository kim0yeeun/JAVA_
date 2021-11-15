package interface_instanceof;

public class DriverExample {

	public static void main(String[] args) {
		// 1
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		bus.run();
		taxi.run();
		
		System.out.println("==========");
		
		// 2
		Vehicle vehicle = bus;
		vehicle.run();
		vehicle = taxi;
		vehicle.run();

		System.out.println("==========");
		
		// 3
		drive(bus);
		drive(taxi);

		System.out.println("==========");
		
		// 4
		Driver driver = new Driver();
		driver.d(taxi);
		driver.d(bus);
	}
	public static void drive (Vehicle vehicle) {
		vehicle.run();
	}

}

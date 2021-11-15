package field_Array;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.Run();
		System.out.println("==========");
		myCar.tires[0] = new KumhoTire();
		myCar.tires[2] = new KumhoTire();
		System.out.println("==========");
		myCar.Run();
	}

}

package method_polymorphism;

public class Driver {
	public void drive(Vehicle vehicle) { // 매개변수에 부모클래스의 변수를 사용해서 자식 클래스의 객체를 줄 수 있다. 
		vehicle.run();
	}

}

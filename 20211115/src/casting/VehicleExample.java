package casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); // 자동형변환
		vehicle.run(); // 부모 변수에 버스 객체를 대입했기 때문에 run만 사용이 가능하다.
					   // 자식 클래스에 정의되어 있는 체크페어는 사용할 수 없다. 어떻게 해야하는가!
		Bus bus = (Bus)vehicle; // 강제형변환
		// 부모를 자식에 대입하려면 "(자식클래스명)부모객체" 이렇게 사용해야 한다.
		// 자식 객체에 있는 것을 모두 사용할 수 있다.
		// 부모로부터 상속받은 것도 사용이 가능하다.
		bus.checkFare();
		bus.run();
	}

}

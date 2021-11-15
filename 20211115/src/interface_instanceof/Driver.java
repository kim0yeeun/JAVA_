package interface_instanceof;

public class Driver {
	public void d(Vehicle vehicle) {
		if (vehicle instanceof Bus) {		// vehicle 이 Bus로 만들어진 것이냐?
											// instanceof : 객체와 클래스를 비교할 때 사용 
			// vehicle 객체가 Bus 클래스로 만들어진 객체입니까?
			// instanceof의 결과값은 true, false => boolean으로 반환 
			Bus bus = (Bus)vehicle;		// 버스 객체이면 강제형변환을 해서 
			bus.checkFare();			// 체크페어를 실행하자. 
		}
		vehicle.run();
	}

}

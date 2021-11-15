package method_polymorphsim;

public class Drive {
	public void drive(Vehicle v) { 		// 버스나 택시르 받는 매개변수가 Vehicle이기 때문
		v.run();
	}
}


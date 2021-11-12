
public class RheeAirplane extends Airplane{
	static final int NOMAL = 1; // 일반비행
	static final int SUPERSONIC = 2; // 초음속 비행
	
	int flymode = NOMAL; // 1
	
	public void fly() { // 오버라이딩
		if(flymode == SUPERSONIC) {
			System.out.println("초음속 비행을 한다.");	
		}else {
			super.fly();
		}
	}
	
}

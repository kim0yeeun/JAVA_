
public class RheeAirplaneTest {

	public static void main(String[] args) {
		RheeAirplane ex = new RheeAirplane();
		ex.fly();
		ex.flymode = RheeAirplane.SUPERSONIC;
		ex.fly();
		ex.flymode = RheeAirplane.NOMAL;
		ex.fly();
	}

}

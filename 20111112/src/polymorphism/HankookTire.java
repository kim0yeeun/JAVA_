package polymorphism;

public class HankookTire extends Tire { // 왼쪽
	public HankookTire (String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() { // 오버라이딩 
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTrie 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}
		
	}
}

package polymorphism;

public class KumhoTire extends Tire{ // 오른쪽 
	public KumhoTire (String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() { 
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTrie 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "KumhoTire 펑크 ***");
			return false;
		}
		
	}

}

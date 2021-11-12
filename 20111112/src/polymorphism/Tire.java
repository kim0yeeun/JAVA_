package polymorphism;

public class Tire {
	
	public int maxRotation;
	public int accumulatedRotation;  // 누적 회전수이기 때문에 초기값이 필요없다. 
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() { // 타이어가 굴러가는 메서드
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Trie 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
		
	}

}

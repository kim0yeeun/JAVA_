package inheritance;

public class Ex_09 extends Ex_08{
	int val;
	// 부모클래스에 생성자가 있다면 상속할 때, 자식클래스에 super 해서 초기값을 줘야 한다. 
	public Ex_09(int first, int second,int val) {
		super(first, second);
		this.val = val; // 08 에있는거 할때는 super가 아니라 this로 주면 됨
	}
	// public Ex_09 () {} 디폴트 생성자를 사용할 수없다.
	// 부모 클래스에 값을 전달해주기 위한 생성자를 써야하기 떄문이다. 
	public void sub() {
		result = first - second;
	}
	public void mul() {
		result = first * second;
	}
	
	///// 부모가 만든 메서드를 재정의 : 오버라이딩 
	/// 그럼 main에서 호출할 경우 자식에서 오버라이딩한 함수로 사용된다. 
	@Override // 오버라이딩 된 대상임을 표현 @ : 어노테이션 
	public void div() {
		if (second == 0 ) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			result = first / second;
		}	
	}
	public void div1() {
		super.div(); // 이러면 부모가 가진 div를 그대로 사용할 수 있다. 
	}

	

}

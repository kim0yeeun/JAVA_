package Access.access1;

public class Ex_01 {
	int first;  // 멤버필드에 접근지정자를 주지 않으면 default int first 로 접근 지정자가 된다. 
				// default는 다른 패키지에서는 상속이 되지 않는다. 
				// 다른 패키지에서는 사용할 수 없다. 
	int second;
	int result;
	public void add() {
		result = first + second;
	}
	public void div() {
		result = first / second;
	}
}

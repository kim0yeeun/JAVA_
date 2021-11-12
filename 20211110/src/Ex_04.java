
public class Ex_04 { // static 변수 초기화 방법 
	
	static int first;
	static int second;
	// static 변수는 생성자를 이용해서 초기화 할 수 없다. 
	// static 변수를 초기화 할 때에는 static블럭을 이용한다.
	static {
		first = 10;
		second = 20;
	}
	int val;
	public Ex_04() {}
	public Ex_04(int val) {
		this.val = val;
	}
}

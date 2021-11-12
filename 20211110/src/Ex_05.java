
public class Ex_05 {
	static int first;
	static int second;
	int val; // 멤버변수이면서 instance 변수이다. 즉 객체마다 새롭게 존재하는 변수이다. 
	static {
		first = 20;
		second = 10;
		//val = 10; instance 변수는 static 블럭에서 초기화 할 수 없다. 
	}
	public static int add() {
		return first + second;
	}
}


public class Ex_07 {

	int first;
	int second;
	int result;
	// 매개변수가 있는 생성자
	public Ex_07(int first, int second) {
		this.first = first;
		this.second = second;
	}
	// 매개변수가 없는 생성자 = default 생성자 
	// 개발자가 생성자를 만들면 디폴트 생성자는 자동으로 만들어지지 않는다. 
	// 생성자를 있을 경우에는 디폴트 생성자는 명시적으로 만들어줘야한다.  
	
	
	public Ex_07() {
		System.out.println("디폴트 생성자 실행");
	}
	
	// setter
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	// getter
	public int getFirst() {
		return this.first;
	}
	public int getSecond() {
		return this.second;
	}
	public int getResult() {
		return this.result;
	}
	
	// 
	public void add() {
		this.result = this.first+this.second;
	}
	public void sub() {
		this.result = this.first-this.second;
	}
}

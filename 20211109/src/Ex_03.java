
public class Ex_03 {
	int first;		// 멤버필드
	int second;
	int result;
	
	// 멤버 필드를 초기화하기 위해 사용
	// Python에서 self가 Java에서는 this로 사용
	public void setData(int first, int second) {
		this.first = first;  // this가 붙으면 멤버필드 (파란색)
							 // this가 없으면 매개변수 (갈색)
		this.second = second;
		
	}
	// setter
	public void setFirst(int first) { // set다음에 멤버필드명 적을 때 첫글자는 대문자 
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
	
	
	public void add() {
		this.result = this.first + this.second;
	}
	public void sub() {
		this.result = this.first - this.second;
	}
}

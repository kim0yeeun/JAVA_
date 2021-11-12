
public class Ex_02 { // final 상수는 초기값이 존재해야한다.
					 // 생성자를 통해 초기값을 줄 수 있다. 
	final int first;   // finale변수와 상수 이름은 대문자여야한다... 
	final int second;
	String name;
	
	public Ex_02(int first, int second) {
		this.first = first;
		this.second = second;
	}
	/*
	 * public void setFirst(int first) {
	 * this.first = first;
	 * }
	 */ 			/// final을 사용하면 setter를 통해 값을 변경할 수가 없다. 
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	// final은 값을 초기화할 수는 없지만 값을 전달할 수는 있따.
	public int getFirst() {
		return this.first;
	}
	public int getSecond() {
		return this.second;
	}
}
	 

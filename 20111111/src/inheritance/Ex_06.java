package inheritance;

public class Ex_06 {
	int first;
	int second;
	int result;
	public Ex_06() {
		System.out.println("부모클래스 객체 생성 완료");
	}

	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getResult() {
		return result;
	}

	public void add() {
		result = first + second;
	}

}

package inheritance;

public class Ex_08 {
	int first;
	int second;
	int result;

	public Ex_08(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	public void add() {
		result = first + second;
	}
	public void div() {
		result = first / second;
	}


}

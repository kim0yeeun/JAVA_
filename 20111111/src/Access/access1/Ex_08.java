package Access.access1;

public class Ex_08 {
	private int first;
	private int second;
	
	public Ex_08 (int first, int second) {
		this.first = first;
		this.second = second;
	}
	public int add() {
		return first + second;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getFirst() {
		return first;
	}
	public int getSecond() {
		return second;
	}
	
	
}

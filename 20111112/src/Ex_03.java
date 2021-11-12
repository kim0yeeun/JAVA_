
public class Ex_03 extends Ex_02{ // 자식클래스 
	String subject;
	public Ex_03 (int radius, double pi, String subject) {
		super(radius,pi);
		this.subject = subject;
	} // 부모클래스에 생성자가 있다면 자식클래스에도 생성자가 있어야 한다.
	  // 매개변수는 부모클래스의 것들 기본 + 자식클래스 
	
	@Override
	public double area() { // 재정의 
		return radius * radius * Math.PI;
	}
	public double area(double p) {	// 같은 이름의 함수여도 매개변수의 개수나 타입이 다르면 오버로딩 되어 만들 수 있다. 
		return radius * radius * pi;
	}
	
	public double area1() {
		return super.area(); // 부모가 가진 area() 를 다시 사용하겠다는 의미 
	}

}

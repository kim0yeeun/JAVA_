
public class Ex_02 extends Ex_01{
	public void method02() {
		// 추상 메서드가 있는 클래스는 객체 생성을 할 수 없다.
		// Ex_01 ex01 = new Ex_01(12);
		// 그래서 확장해서 사용해야한다. 
	}
	
	@Override
	public void method01() {
		// 확장해서 사용하는 추상메서드는 오버라이딩해서 재정의해야한다.
		System.out.println("Ex_02-method");
	}
	// 부모 클래스에 생성자가 있으면 자식클래스에 값을 전달하기 위해 super를 사용한다. 
	public Ex_02(int first) {
		super(first);
	}
}

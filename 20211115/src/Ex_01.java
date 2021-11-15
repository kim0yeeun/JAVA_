
public abstract class Ex_01 {		// 추상클래스 복습
	// 멤버 필드
	int first;
	// 생성자
	public Ex_01(int first) {
		this.first = first;
	}
	// 추상 메서드 : 아무것도 정의되어 있지 않은 메서드 
	public abstract void method01();
	// 일반 메서드
	public void method02() {
		System.out.println("Ex_01-method");
	}

}

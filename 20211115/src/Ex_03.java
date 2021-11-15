
public interface Ex_03 {
	// 상수
	static final int FIRST = 10;
	// 추상 메서드 -> 오버라이딩해서 사용
	public void method01();
	// 인터페이스는 생성자가 없다.
	// 일반 메서드가 없다. // 멤버필드 없다
	// 메서드가 하는 역할은 외부로부터 멤버필드에 값을 전달받거나
	// 멤버필드에 있는 값을 외부에 전달하는 것이다. 
	default void method02() {
		System.out.println("Default-method");
		System.out.println("디폴트 메서드는 정의되어 있어야 합니다.");
	}
	static void method03() {
		System.out.println("Static-method");
		System.out.println("default메서드와 static메서드는 Java8 버전부터 추가되었습니다.");
	}

}

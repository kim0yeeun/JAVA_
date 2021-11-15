package default_method;

public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		System.out.println("MyclassB-method1() 실행");
	}
	@Override
	public void method2() {
		System.out.println("MyClassB-method2() 실행");
	}

}

// 메서드2 도 오버라이드 함
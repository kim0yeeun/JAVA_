package default_method;

public class MyClassA implements MyInterface{

	@Override
	public void method1() {
		System.out.println("MyClassA-method1() 실행");
	}

}

// 메서드2 를 오버라이드 하지 않음 
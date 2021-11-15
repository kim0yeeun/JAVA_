package default_method;

public class ClassC extends ClassA{
	public void method04() {
		System.out.println("ClassC-method04");
	}

	@Override
	// 추상 메서드는 무조건 Override
	public void method01() {
		System.out.println("ClassC-method01");
	}
	@Override
	// 일반 메서드도 오버라이드 했다. -> 상속받은 일반메서드를 오버라이드 할 때도 있고 안 할 때도 있다.
	// 이렇게 오버라이드를 해도되고 안해도되는 메서드가 필요할 경우엔 무조건 추상클래스를 써서 사용했다. (java7 버전까지)
	// 그래서 java8 버전부터는 인터페이스에서 default 메서드를 만들었따 ! 
	// -> MyInterface 보자 
	
	public void method02() {
		System.out.println("ClassC-method02");
	}

}

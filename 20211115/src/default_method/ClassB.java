package default_method;

public class ClassB extends ClassA {
	public void method03() {
		System.out.println("ClassB-method03");
	}
	@Override
	// 상속받은 classA에 있는 일반 메서드는 오버라이딩 하지 않아도 된다. 
	// 추상 메서드만 Override 해야만한다. 
	public void method01() {
		System.out.println("ClassB-method01");
	}
}

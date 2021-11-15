package default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		MyInterface mil = new MyClassA();
		mil.method1();
		mil.method2();		// default 메서드를 재정의 안했으니 MyInterface 에 있는 메서드 실행
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();		// default 메서드를 재정의 했으니까 MyClassB에 있는 메서드 실행 
	}

}

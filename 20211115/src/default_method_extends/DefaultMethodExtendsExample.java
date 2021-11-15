package default_method_extends;

public class DefaultMethodExtendsExample {

	public static void main(String[] args) {
		ChildInterface1 c1 = new ChildInterface1() {  // 익명객체
			// 재정의해야할 것은? 부모의 메서드1과 자식3의 메서드3 
			@Override
			public void method1() { // 추상메서드는 꼭 ! 재정의해줘야한다. 
				System.out.println("ChildInterface1-method1-재정의");
			}
			@Override
			public void method3() {
				System.out.println("ChildInterface1-method3-재정의");
			}
		};
		System.out.println("ChildInterface1-c1 실행");
		c1.method1();
		c1.method2();
		c1.method3();
		System.out.println("=========================");
		
		ChildInterface2 c2 = new ChildInterface2() {
			
			@Override
			public void method1() {
				System.out.println("ChildInterface2-method1-재정의");
			}
			@Override
			public void method3() {
				System.out.println("ChildInterface2-method3-재정의");
			}
		};
		System.out.println("ChildInterface2-c2 실행");
		c2.method1();
		c2.method2();	// child2에서 재정의한 default 한 메서드 
		c2.method3();
		System.out.println("=========================");
		
		ChildInterface3 c3 = new ChildInterface3() {
			
			@Override
			public void method1() {
				System.out.println("ChildInterface3-method1-재정의");
			}
			@Override
			public void method2() {   // child3 에서 default 메서드를 추상메서드로 바꿨기 때문에 꼭! 재정의해줘야한다. 
				System.out.println("ChildInterface2-method2-재정의");
			}
			@Override	
			public void method3() {
				System.out.println("ChildInterface3-method3-재정의");
			}
		};
		System.out.println("ChildInterface3-c3 실행");
		c3.method1();
		c3.method2();	// default 메서드를 추상메서드로 만들어서 꼭 재정의해야하는 메서드 
		c3.method3();
	}

}

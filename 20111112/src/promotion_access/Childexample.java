package promotion_access;

public class Childexample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println("==========");
		
		Parent parent = new Parent();
		parent.method2();			// 부모 클래스의 메서드2
		parent = child;				// 부모는 자식을 참조할 수 있다.
		parent.method1();
		parent.method2();			// 자식 클래스의 메서드2 즉, 오버라이딩된 메서드는 사용이 가능하다. 
		// parent.method3(); 		// 부모가 자식을 참조할 경우, 자식에 정의된 것은 사용할 수 없다. (오버라이딩 된 메서드만 사용 가능)
		
	}

}

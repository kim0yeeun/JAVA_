
public class Ex_04test {
	public static void main(String [] args) {
		B b = new B();	// A
		C c = new C();	// A
		D d = new D();	// B, A
		E e = new E();	// C, A
		// 다형성 : 부모는 자식 객체를 참조할 수 있다. (기본원칙)
		
		A a = b; // a 가 b 가 되었다.
		a = c;   // a 가 c 가 되었다.
		a = d;	 // a 가 d 가 되었다.
		a = e;	 // a 가 e 가 되었다.
		
		// 여러가지의 형태를 가질 수 있다. : 다형성 
		// 다형성의 기본 조건 : 자식은 부모를 상속받아야한다. 
		
		
	}

}

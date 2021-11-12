package polymorphism;

public class Btest {

	public static void main(String[] args) {
		B b = new B();
		A a = b;
		a.method0();
// 		a.method1(); // 사용하지 못함 
	}

}


// 이렇게 상속 후 재정의하면 굳이 부모 클래스에 정의할 이유가 없다? => 추상화 
package default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		MyInterface mil = new MyClassA();
		mil.method1();
		mil.method2();		// default �޼��带 ������ �������� MyInterface �� �ִ� �޼��� ����
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();		// default �޼��带 ������ �����ϱ� MyClassB�� �ִ� �޼��� ���� 
	}

}

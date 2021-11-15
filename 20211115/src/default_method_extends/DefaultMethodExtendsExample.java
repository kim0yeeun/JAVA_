package default_method_extends;

public class DefaultMethodExtendsExample {

	public static void main(String[] args) {
		ChildInterface1 c1 = new ChildInterface1() {  // �͸�ü
			// �������ؾ��� ����? �θ��� �޼���1�� �ڽ�3�� �޼���3 
			@Override
			public void method1() { // �߻�޼���� �� ! ������������Ѵ�. 
				System.out.println("ChildInterface1-method1-������");
			}
			@Override
			public void method3() {
				System.out.println("ChildInterface1-method3-������");
			}
		};
		System.out.println("ChildInterface1-c1 ����");
		c1.method1();
		c1.method2();
		c1.method3();
		System.out.println("=========================");
		
		ChildInterface2 c2 = new ChildInterface2() {
			
			@Override
			public void method1() {
				System.out.println("ChildInterface2-method1-������");
			}
			@Override
			public void method3() {
				System.out.println("ChildInterface2-method3-������");
			}
		};
		System.out.println("ChildInterface2-c2 ����");
		c2.method1();
		c2.method2();	// child2���� �������� default �� �޼��� 
		c2.method3();
		System.out.println("=========================");
		
		ChildInterface3 c3 = new ChildInterface3() {
			
			@Override
			public void method1() {
				System.out.println("ChildInterface3-method1-������");
			}
			@Override
			public void method2() {   // child3 ���� default �޼��带 �߻�޼���� �ٲ�� ������ ��! ������������Ѵ�. 
				System.out.println("ChildInterface2-method2-������");
			}
			@Override	
			public void method3() {
				System.out.println("ChildInterface3-method3-������");
			}
		};
		System.out.println("ChildInterface3-c3 ����");
		c3.method1();
		c3.method2();	// default �޼��带 �߻�޼���� ���� �� �������ؾ��ϴ� �޼��� 
		c3.method3();
	}

}

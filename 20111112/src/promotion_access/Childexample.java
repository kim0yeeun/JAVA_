package promotion_access;

public class Childexample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println("==========");
		
		Parent parent = new Parent();
		parent.method2();			// �θ� Ŭ������ �޼���2
		parent = child;				// �θ�� �ڽ��� ������ �� �ִ�.
		parent.method1();
		parent.method2();			// �ڽ� Ŭ������ �޼���2 ��, �������̵��� �޼���� ����� �����ϴ�. 
		// parent.method3(); 		// �θ� �ڽ��� ������ ���, �ڽĿ� ���ǵ� ���� ����� �� ����. (�������̵� �� �޼��常 ��� ����)
		
	}

}


public class Ex_04test {
	public static void main(String [] args) {
		B b = new B();	// A
		C c = new C();	// A
		D d = new D();	// B, A
		E e = new E();	// C, A
		// ������ : �θ�� �ڽ� ��ü�� ������ �� �ִ�. (�⺻��Ģ)
		
		A a = b; // a �� b �� �Ǿ���.
		a = c;   // a �� c �� �Ǿ���.
		a = d;	 // a �� d �� �Ǿ���.
		a = e;	 // a �� e �� �Ǿ���.
		
		// ���������� ���¸� ���� �� �ִ�. : ������ 
		// �������� �⺻ ���� : �ڽ��� �θ� ��ӹ޾ƾ��Ѵ�. 
		
		
	}

}

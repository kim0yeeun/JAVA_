package WrapprtExample;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = 100 ;		// �ڽ� boxing : �⺻�ڷ����� wrapper �ڷ����� �ִ� �� 
		
		int i1 = i; 			// Integer => int : Unboxing ��ڽ� 
		int i2 = 20;
		// �ڵ� unboxing : �ڵ� ����ȯ�� �ǹǷ� i �� ��ڽ� �ȴ�. 
		int result = i + i2; 
		
		// �� ������� �ʴ� ��� 
		Integer i3 = new Integer(10); 
		Integer i4 = new Integer("10");
		Integer i5 = Integer.valueOf("300");
		// �ַ� ����ϴ� ���
		Integer i6 = 10; 
		
		Integer i7 = i6; 		// �ڵ� ��ڽ� 
		i7 = i6.intValue();		// ��ڽ� // �� �Ⱦ� �����ص� �ſ� 
		
		int i8 = 10;
		Integer i9 = 10;
		i9 = i8;
		
	}

}

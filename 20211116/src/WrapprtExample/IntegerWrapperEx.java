package WrapprtExample;

public class IntegerWrapperEx {

	public static void main(String[] args) {
		int i = 10;
		String s ="10";
		
		Integer i1 = 10 ;
		// int �� �Ȱ��� ����ϸ� �ȴ�. ������ �����ϴ� �ڷ���
		i1 = Integer.parseInt(s); // ���ڿ� ���� ���ڷ� ������ �� �ִ�.
		
		int in = 10;
		Integer in1 = 10;
		
		byte by = 10;
		Byte by1 = 10;
		
		short sh = 10;
		Short sh1 = 0;
		
		double d = 10.4;
		Double d1 = 10.4;
		
		float f = 10.5f;
		Float f1 = 10.5f; 
		
		// ���� �빮�ڷ� ������ wrapper �ڷ����� �ȴ�.
		
		// f = null; // null : ���� ���������� � �������� �𸥴�.
					 // �⺻�ڷ��������� null���� ���� �� ����.
		f1 = null; 	 // wrapper �ڷ����� ���ڷ� ��ȯ�ϱ⵵ ������ ���� null���� �����ϱ� ���� ����Ѵ�. 
	}

}

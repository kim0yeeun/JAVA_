package WrapprtExample;

public class StringToPrimitiveValueEx {
	public static void main(String[] args) {
		int i = Integer.parseInt("10"); 		// ���ڿ��� ���ڷ� ��ȯ
												// wrapper �ڷ��� Integer�� �̿��ؼ� �ٲ�
		double b1 = Double.parseDouble("10.5");
		boolean b = Boolean.parseBoolean("true");
		
		System.out.println(i);
		System.out.println(b1);
		System.out.println(b);
	}

}

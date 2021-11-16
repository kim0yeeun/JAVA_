package WrapprtExample;

public class StringToPrimitiveValueEx {
	public static void main(String[] args) {
		int i = Integer.parseInt("10"); 		// 문자열을 숫자로 변환
												// wrapper 자료형 Integer를 이용해서 바꿈
		double b1 = Double.parseDouble("10.5");
		boolean b = Boolean.parseBoolean("true");
		
		System.out.println(i);
		System.out.println(b1);
		System.out.println(b);
	}

}

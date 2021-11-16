package WrapprtExample;

public class IntegerWrapperEx {

	public static void main(String[] args) {
		int i = 10;
		String s ="10";
		
		Integer i1 = 10 ;
		// int 와 똑같이 사용하면 된다. 정수를 저장하는 자료형
		i1 = Integer.parseInt(s); // 문자열 값을 숫자로 저장할 수 있다.
		
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
		
		// 앞을 대문자로 적으면 wrapper 자료형이 된다.
		
		// f = null; // null : 값은 존재하지만 어떤 값인지를 모른다.
					 // 기본자료형에서는 null값을 넣을 수 없다.
		f1 = null; 	 // wrapper 자료형은 숫자로 변환하기도 쉽지만 보통 null값을 저장하기 위해 사용한다. 
	}

}

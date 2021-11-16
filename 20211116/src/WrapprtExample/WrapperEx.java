package WrapprtExample;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = 100 ;		// 박싱 boxing : 기본자료형을 wrapper 자료형에 넣는 것 
		
		int i1 = i; 			// Integer => int : Unboxing 언박싱 
		int i2 = 20;
		// 자동 unboxing : 자동 형변환이 되므로 i 가 언박싱 된다. 
		int result = i + i2; 
		
		// 잘 사용하지 않는 방식 
		Integer i3 = new Integer(10); 
		Integer i4 = new Integer("10");
		Integer i5 = Integer.valueOf("300");
		// 주로 사용하는 방식
		Integer i6 = 10; 
		
		Integer i7 = i6; 		// 자동 언박싱 
		i7 = i6.intValue();		// 언박싱 // 잘 안씀 기억안해도 돼요 
		
		int i8 = 10;
		Integer i9 = 10;
		i9 = i8;
		
	}

}

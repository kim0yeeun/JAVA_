package WrapprtExample;

public class ValueCompareEx {
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 10;
		if (i1==i2) {
			System.out.println("같다");
		}
		Integer i3 = 10;
		Integer i4 = 10;
		if (i3==i4) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		// unboxing
		if(i3.intValue() == i4.intValue()) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
		System.out.println(i3.intValue() == i4.intValue());
		
		i3 = 10;
		i4 = 10; // -128~ 127
		
		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
		System.out.println(i3.intValue() == i4.intValue());
		
		i3 = 300;
		i4 = 300;
		
		System.out.println(i3 == i4);			// false 왱? 
		System.out.println(i3.equals(i4));
		System.out.println(i3.intValue() == i4.intValue());
		
		// -128~ 127 사이의 값만 true 
	}

}

package StringClass;

public class StringMethod {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		//			  01234567890123
		//						1
		char ch = ssn.charAt(7);
		switch (ch) {
		case '1' :
		case '3' : System.out.println("남자"); break;
		case '2' :
		case '4' : System.out.println("여자"); break;
		}
		System.out.println(ssn.charAt(7));
		
		String str = "나는 자바가 너무 재미있습니다.";
		//						   10 
		System.out.println(str.charAt(10));
		// charAt() : index에 해당하는 문자를 가져온다. 
		
		System.out.println("=====");
		
		// Method 정리
		String str1 = "apple";
		boolean b1 = str1.startsWith("ap");
		System.out.println(b1);
		b1 = str1.startsWith("le");
		System.out.println(b1);
		b1 = str1.endsWith("le");
		System.out.println(b1);
		
		System.out.println("=====");
		
		str = "java"; // 이렇게 하믄안댜 
		str1 = "java";
		System.out.println(str1 == str);
		
		str = new String("java");
		str1 = new String("java");
		System.out.println(str1 == str);				// 주소가 다름 
		
		// 그래서 비교할땐 equals
		System.out.println(str1.equals(str));
		
		str1 = "I like the java.";
		System.out.println(str1.indexOf("t"));
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf("a"));		// 뒤에서부터 찾아오세요. 
		System.out.println(str1.length()); 				// 배열에서만 괄호 없다! 
		int []ii = new int[5];
		System.out.println(ii.length);
		
		// I를 i로 바꾸기
		System.out.println(str1.replace('I', 'i'));
		// I를 We로 바꾸기
		System.out.println(str1.replaceAll("I", "We"));

		
		// 문자열을 split을 하면 배열로 저장
		str = "A:B:C:D:abcd";
		String[] str2 =str.split(":");
		System.out.println(str2[1]);
		str = "A B C D abcd";
		str2 = str.split(" ");
		System.out.println(str2[1]);
		
		
		// 파이썬에서는 slicing  : a = "abcdef" : a[1:3]
		// 자바에선 substring
		str1 = "abcdef";
		System.out.println(str1.substring(1, 1 + 2));
		str1 = "I like the java";
		int start = str1.indexOf("t");
		System.out.println(str1.substring(start, start + 8));
		
		
		// 대문자 <-> 소문자
		str1 = "abcDEF";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		// 숫자를 문자로 변경
		Integer i = 10;
		str = "10" + i.toString(); // 숫자를 문자로 변경
		System.out.println(str);
		
		// 양쪽 공백 지우기
		str1 = " abc DEF "; // strip
		System.out.println(str1.trim());
		
		// : / - , 로 substring 하기 
		str = "A:B/C-D,abcd";
		str2 = str.split(":|/|-|,");
		for (int i1=0; i1<str2.length ; i1++) {
			System.out.println(str2[i1]);
		}
		System.out.println(str2[1]);
	}

}

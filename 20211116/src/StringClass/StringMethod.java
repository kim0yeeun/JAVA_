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
		
		str = "java";
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
		
		int start = str1.indexOf("t");
		System.out.println(str1.substring(start,start+8));
		
		str = "A:B/C-D,abcd";
		//str2 =str1.split(":|/|-|,|");
		//System.out.println(str2);
		
		// I를 i로 바꾸기
		System.out.println(str1.replace('I', 'i'));
		// I를 We로 바꾸기
		System.out.println(str1.replaceAll("I", "We"));
		
		
		
		
		
	}

}

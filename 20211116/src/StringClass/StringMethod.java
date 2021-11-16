package StringClass;

public class StringMethod {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		//			  01234567890123
		//						1
		char ch = ssn.charAt(7);
		switch (ch) {
		case '1' :
		case '3' : System.out.println("����"); break;
		case '2' :
		case '4' : System.out.println("����"); break;
		}
		System.out.println(ssn.charAt(7));
		
		String str = "���� �ڹٰ� �ʹ� ����ֽ��ϴ�.";
		//						   10 
		System.out.println(str.charAt(10));
		// charAt() : index�� �ش��ϴ� ���ڸ� �����´�. 
		
		System.out.println("=====");
		
		// Method ����
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
		System.out.println(str1 == str);				// �ּҰ� �ٸ� 
		
		// �׷��� ���Ҷ� equals
		System.out.println(str1.equals(str));
		
		str1 = "I like the java.";
		System.out.println(str1.indexOf("t"));
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf("a"));		// �ڿ������� ã�ƿ�����. 
		System.out.println(str1.length()); 				// �迭������ ��ȣ ����! 
		int []ii = new int[5];
		System.out.println(ii.length);
		
		int start = str1.indexOf("t");
		System.out.println(str1.substring(start,start+8));
		
		str = "A:B/C-D,abcd";
		//str2 =str1.split(":|/|-|,|");
		//System.out.println(str2);
		
		// I�� i�� �ٲٱ�
		System.out.println(str1.replace('I', 'i'));
		// I�� We�� �ٲٱ�
		System.out.println(str1.replaceAll("I", "We"));
		
		
		
		
		
	}

}

package Runtime_exception;

public class ClassNotFoundExceptionEx {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.util.List1");
			System.out.println("클래스가 있습니당");
		}catch (ClassNotFoundException e) {
			System.out.println("클래스가 없습니당");
			e.printStackTrace(); // 변수명.에러메세지출력해라
								 // 에러메세지를 출력한 것이지 프로그램이 종료된 것이 아니다. 아래에 + 출력가능
			// 개발자가 어떠한 오류인지 확인하기 위한 코드 
		}
		System.out.println("프로그램이 종료되지 않았습니다.");
	}

}

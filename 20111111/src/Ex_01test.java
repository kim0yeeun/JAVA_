
public class Ex_01test {
	public static void main(String[]args) {
		Ex_01 ex01 = new Ex_01();
		Ex_01 ex02 = new Ex_01();
		
		if (ex01 == ex02){
			System.out.println("같다");
		}else {
			System.out.println("다르다");
			}
		ex01.first = 20;
		ex01=ex02; // ex02의 주소를 ex01도 같은걸 가리키게 한다. 
		System.out.println(ex01.first);
		System.out.println(ex02.first);
		if (ex01 == ex02){
			System.out.println("같다");
		}else {
			System.out.println("다르다");
			}
		ex02.first = 30;
		System.out.println(ex01.first);
		System.out.println(ex02.first);
		
		
		
		Singleton s1 = Singleton.getInstance() ;  // 주소 번지가 날라옴
		Singleton s2 = Singleton.getInstance() ;  // 같은 주소 번지가 날라옴
		// 20111111_2 메모장 참고 (5만번지) 
		if (s1==s2) {
			System.out.println("s1과 s2는 같은 주소를 사용한다.");
		}else {
			System.out.println("다르다.");
		}
		
	}
}
	


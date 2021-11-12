
public class Ex_01test1 {

	public static void main(String[] args) {
		Ex_01 ex01 = new Ex_01();		     // stack    				heap
		Ex_01 ex02 = ex01;		    //ex01		10000			10000 |first|second|
							    	//ex02		10000			
		Ex_01 ex03 = new Ex_01();	//ex03		20000			20000 |first|second|
		
		ex01.first = 30;
		System.out.println(ex01.first);
		System.out.println(ex02.first);
		System.out.println(ex03.first);
		
		if (ex01==ex02) {
			System.out.println("ex01과 ex02는 같은 객체이다.");
		}else {
			System.out.println("ex01과 ex02는 다른 객체이다.");
		}
		if (ex01==ex03) {
			System.out.println("ex01과 ex03는 같은 객체이다..");
		}else {
			System.out.println("ex01과 ex03는 다른 객체이다.");
		}
		// int result = Singleton.val; // 직접 접근 (외부에서도 접근) 하고 싶으면 private를 지워라 
		int result = Singleton.val_1;
		System.out.println(result);
		
		Singleton s1 = Singleton.getInstance(); // s1 = 30000번지 (싱글톤주소)
		Singleton s2 = Singleton.getInstance(); // s2 = 30000번지
		
		if (s1==s2) {
			System.out.println("s1과 s2는 같은 객체이다.");
		}else {
			System.out.println("다르다.");
		}
 			
	}
}

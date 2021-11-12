package inheritance;

public class Ex_08test {

	public static void main(String[] args) {
		Ex_09 ex09 = new Ex_09(30,10,15);
		ex09.add();
		System.out.println(ex09.getResult());
		ex09.div();
		System.out.println(ex09.getResult());
		ex09.sub();
		System.out.println(ex09.getResult());

		
		
		
		System.out.println("=====");
		
		Ex_09 ex090 = new Ex_09(0, 10, 15); // 분자에 0
		ex090.div();
		System.out.println(ex090.getResult());
		
		Ex_09 ex091 = new Ex_09(10, 0, 15); // 분모에 0 
		ex091.div(); // exception 걸린다. 그래서 바꾸고싶다면? 자식클래스에서 오버라이딩을 하자.
					 // 자식 클래스에서 재정의한 div가 사용되며, 부모 클래스의 div는 숨겨진다. 
		ex091.div1(); // 부모가 가지고 있는 메서드를 호출한다.  
		

	}

}

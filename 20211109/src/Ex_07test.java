
public class Ex_07test {

	public static void main(String[] args) {
		// Ex_7 ex07 = new 생성자 
		Ex_07 ex07 = new Ex_07(20,10);
		ex07.add();
		System.out.println(ex07.getResult());
		
		
		//초기화를 하지 않고 get해서 값 전달하고 싶다면? 매개변수가 없는 생성자를 만들자
		
		Ex_07 ex07_1 = new Ex_07(); // 디폴트생성자 default
		ex07.setFirst(100);
		ex07.setSecond(50);
		
		
		Ex_07 ex07_2 = new Ex_07(); // 디폴트 생성자 실행 
		ex07_2.setFirst(30);
		System.out.println(ex07_2.getFirst());
		
		

	}

}

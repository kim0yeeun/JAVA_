
public class Ex_05test {

	public static void main(String[] args) {
		Ex_05 ex05 = new Ex_05();
//		// 직접 멤버에 접근할 수가 없다. 
		// = 멤버의 은닉
//		ex05.age = 20;
//		ex05.height = 169.5;
		
		// 멤버에 접근하기 위해서는 함수를 사용해야 한다. 
		ex05.setAge(30);
		ex05.setHeight(169.6);
		
		//System.out.println(ex05.age);
		System.out.println(ex05.getAge());
		
		ex05.setName("이장범"); 							//?????????????????????????
		System.out.println(ex05.name);	
		
	}

}

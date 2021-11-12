
public class Ex_03test {

	public static void main(String[] args) {
		Ex_03 ex031 = new Ex_03();
		ex031.first = 10;
		ex031.second = 20;
		ex031.val = 30;
		ex031.val1 = 3;
		
		Ex_03 ex032 = new Ex_03();
		System.out.println(ex032.first); // 0
		System.out.println(ex032.second); //0
		System.out.println(ex032.val); 
		//30 static변수이므로 class내에 만들어져있기때문에 8번줄에서 30 줬으니까 그대로 출력된다. 
		System.out.println(Ex_03.val);
		int result = ex031.add();
		System.out.println(result);   // 10 + 30 = 40 
		result = ex032.add();
		System.out.println(result);   // 0 + 30 = 40
		// static변수는 모든 객체 내에서 값을 공유해서 사용하게 된다.
		
		System.out.println("=====");
		
		result = Ex_03.sub(); 
		// static 메서드는 클래스명을 이용해서 사용해야 한다. instance는 사용할 수가 없다. 
		// 메서드 내에서 this키워드를 사용할 수 없다. 
		
		System.out.println(result);
		
		Ex_03 test;
		test=ex031;
		test.first = 500;
		System.out.println(ex031.first);
	}

}

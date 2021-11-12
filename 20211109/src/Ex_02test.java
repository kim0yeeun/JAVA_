
public class Ex_02test {

	public static void main(String[] args) {
		int i = 10;
		Ex_02 ex02 = new Ex_02();
	//  자료형  변수명
	//  클래스  변수명새로생성 
		ex02.addr = "분당";
		ex02.age = 35;
		ex02.name = "이숭무";
		ex02.gender = false;
		System.out.println(ex02.addr);
		System.out.println(ex02.gender);
		
		Ex_02 ex02_1 = new Ex_02();
		ex02_1.addr = "분당";
		ex02_1.age = 18;
		ex02_1.name = "이상범";
		System.out.println(ex02_1.name);
		
	
	
	}

}

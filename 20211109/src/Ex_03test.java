
public class Ex_03test {

	public static void main(String[] args) {
		// ex03 = Ex_03 # 파이썬에서 선언하는 방식
		Ex_03 ex03 = new Ex_03(); // 자바에서 선언하는 방식
		ex03.setData(20,10);
		// ex03.first = 20; ex03.second = 10;
		ex03.add();
		System.out.println(ex03.result);
		ex03.sub();
		System.out.println(ex03.result);
		
		
		Ex_03 ex03_1 = new Ex_03();
		ex03_1.setData(200,100);
		ex03_1.sub();
		System.out.println(ex03_1.result);
	}

}

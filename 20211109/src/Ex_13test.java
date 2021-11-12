
public class Ex_13test {

	public static void main(String[] args) {
		Ex_13 ex13 = new Ex_13(50, 20);
		int num = ex13.add(20, 10);
		System.out.println(num);
		ex13.sub(30, 15.0);
		num = ex13.mul();
		System.out.println(num);
		ex13.div();
		ex13.add = 10;
		System.out.println(ex13.add);
	}

}
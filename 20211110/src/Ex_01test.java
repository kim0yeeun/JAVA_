public class Ex_01test {

	public static void main(String[] args) {
		Ex_01 ex01 = new Ex_01(20, 10); // first = 20, second = 10
		int result = ex01.add(); // 객체 내에 있는 함수를 외부에서 사용
		                   // ex01은 메서드 내에 있는 this에 전달
		                   // this.first = ex01.first
		System.out.println(result);	
		result = add(30, 10);
		System.out.println(result);
		Ex_01 ex02 = new Ex_01(50, 20); // first = 50, second = 20
		result = ex02.add(); // this.first ==> ex02.first
	}
	public static int add(int num1,  int num2) {
		return num1 + num2;
	}
}

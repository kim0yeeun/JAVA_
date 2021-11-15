package Runtime_exception;

public class MultiExceptionExample {
	public static void main(String[] args) {
		int data1 = 0;
		int data2 = 0;
		try {
			data1 = Integer.parseInt(args[0]);
			data2 = Integer.parseInt(args[1]);
			System.out.println(data1);
			System.out.println(data2);
			System.out.println("나눈 값 : " + data1/data2);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력값이 2개가 필요합니다.");
		}catch(ArithmeticException e) {
			if (data2==0) {
				System.out.println("분모는 0일 수 없습니다. (data2)");
			}else {
				System.out.println("나눈 값 : " + data1/data2);
			}
		}
		
	}

}


package Runtime_exception;

public class MultiExceptionEx1 {
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
			//  이 에러 말고 나머지 모든 에러는 그냥 처리할래요 하면 Exception 만 적어주면 된다. 
		}catch(Exception e) {
			if (data2==0) {
				System.out.println(0);
			}else {
				System.out.println("나눈 값 : " + data1/data2);
			}
		}
		
	}

}
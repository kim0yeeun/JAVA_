package Runtime_exception;

public class MultiExceptionEx2 {
	public static void main(String[] args) {
		int data1 = 0;
		int data2 = 0;
		try {
			data1 = Integer.parseInt(args[0]);
			data2 = Integer.parseInt(args[1]);
			System.out.println(data1);
			System.out.println(data2);
			System.out.println("나눈 값 : " + data1/data2);
		}catch(Exception e) { // exception 을 구별하지 않고, 뭐가 걸리든 여기서 처리하겠다. 
			System.out.println("입력값이 2개가 필요합니다.");
			if (data2==0) {
				System.out.println(0);
			}else {
				System.out.println("나눈 값 : " + data1/data2);
			}
		}
		
	}

}
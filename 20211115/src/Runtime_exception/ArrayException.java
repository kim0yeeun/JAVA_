package Runtime_exception;

public class ArrayException {

	public static void main(String[] args) {
		int i [] = {1,2,3,4};
		for (int j = 0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		
		System.out.println("=====");
		
		// 잘못 입력해서 배열의 크기를 넘어섰다면? 
		for (int j = 0; j<=i.length; j++) {
			try {
				System.out.println(i[j]);
			}catch(ArrayIndexOutOfBoundsException e) {} // pass 즉 오류가 발생하면 아무처리도 하지않고 넘기겠다.
		}
	}

}

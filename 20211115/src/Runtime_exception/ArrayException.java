package Runtime_exception;

public class ArrayException {

	public static void main(String[] args) {
		int i [] = {1,2,3,4};
		for (int j = 0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		
		System.out.println("=====");
		
		// �߸� �Է��ؼ� �迭�� ũ�⸦ �Ѿ�ٸ�? 
		for (int j = 0; j<=i.length; j++) {
			try {
				System.out.println(i[j]);
			}catch(ArrayIndexOutOfBoundsException e) {} // pass �� ������ �߻��ϸ� �ƹ�ó���� �����ʰ� �ѱ�ڴ�.
		}
	}

}

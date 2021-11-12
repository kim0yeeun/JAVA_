
public class Ex_12 {

	public static void main(String[] args) {
		// for Each : for문 확장
		int[] i = {1,2,3,4,5};
		int sum = 0;
		// 합계를 구하세요.
		
		for (int j=0; j<i.length; j++) {
			sum+= i[j];
		}
		System.out.println(sum);
		System.out.println("==========");
		sum=0;
		for (int k:i) { //k=i[0], k=i[1],..., k=i[4]
			sum+= k;
		}
		System.out.println(sum);
		System.out.println("==========");
		int i1[][] = {{1,2,3,4},{5,6},{7,8,9,10,11}};
		sum = 0;
		for (int row=0; row<i1.length; row++) {
			for (int col=0; col<i1[row].length; col++) {
				sum+= i1[row][col];
			}
		}
		System.out.println(sum);
		
		System.out.println("==========");
		sum=0;
		for (int[] row : i1) { // i1에 있는 1차원 배열을 하나씩 받아오겠다.
			for (int col : row) { // row에 있는걸 하나씩 받아오면 col
				sum+=col;
			}
		}
		System.out.println(sum);

	}

}

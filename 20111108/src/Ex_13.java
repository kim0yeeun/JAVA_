
public class Ex_13 {

	public static void main(String[] args) {
		// 3행4열인 2차원 배열에 1~100까지 사용하는 Math.random()을 이용하여 
		// 값을 저장한 후에 합계를 출력하세요.
		
		int arr[][]=new int[3][4];
		int sum=0;
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				arr[row][col] = (int)(Math.random()*100)+1;
			}
		}
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.println(arr[row][col]);
				sum+=arr[row][col];
			}
		}
		System.out.println("=====");
		System.out.println(sum);
		
		// foreach문을 사용해서는 값을 저장할 수 없기때문에 반복문 사용 
		sum =0;
		for (int [] row : arr) {
			for (int col : row) {
				sum+= col;
			}
		}
		System.out.println("=====");
		System.out.println(sum);
		
		System.out.println("=====");
		// 합계와 평균을 foreach문을 사용해서 구하세요.
		sum=0;
		int [] score = {60,89,56,73,66,90,95};
		for(int x : score) {
			sum+= x;
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+sum/score.length);

	}

}

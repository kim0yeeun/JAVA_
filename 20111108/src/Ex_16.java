import javax.tools.DocumentationTool.Location;

public class Ex_16 {

	public static void main(String[] args) {
		// 모두 for문과 foreach문 두 가지를 사용해서 출력하세요.
		
		// i 
		int [] i = {1,2,3,4,5,6};
		for(int j=0; j<=i.length; j++) {
			System.out.println(j);
		}
		for(int j : i) {
			System.out.println(j);
		} System.out.println("=====");
		
		
		// str
		String [] str = {"이숭무", "이상범", "이장범", "김찬중"};
		for(int j=0; j<str.length; j++) {
			System.out.println(str[j]);
		}
		for(String j : str) {
			System.out.println(j);
		} System.out.println("=====");
		
		
		// d
		double [] d = {10.5, 20.6, 40.7, 200.8};
		for(int j=0; j<d.length; j++) {
			System.out.println(d[j]);
		}
		for(double j : d) {
			System.out.println(j);
		} System.out.println("=====");
		

		
		// days 
		Week_1 [] days = Week_1.values();
		for(int j = 0; j<days.length; j++) {
			System.out.println(days[j]);
		}
		for(Week_1 w : days) {
			System.out.println(w);
		} System.out.println("=====");

		
	
		// locations
		String [][] locations = {{"영등포","노량진","종로"},{"염창","등촌","가양"},{"모란","수란","미금"}};
		for(int row=0; row<locations.length; row++) {
			for(int col=0; col<locations[row].length; col++) {
				System.out.println(locations[row][col]);
			}
		}
		for(String[] row : locations) {
			for(String col : row) {
				System.out.println(col);
			}	
		} System.out.println("=====");
		
		
		
		
		// vals
		int [][] vals = {{1,2,3},{4,5},{6,7,8,9}};
		for(int row=0; row<vals.length; row++) {
			for(int col=0; col<vals[row].length; col++) {
				System.out.println(vals[row][col]);
			}
		}
		for(int [] row : vals) {
			for (int col : row) {
				System.out.println(col);
			}
		}
		
		}
	}

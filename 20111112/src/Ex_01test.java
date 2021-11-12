
public class Ex_01test {

	public static void main(String[] args) {
		Ex_01 ex01 = new Ex_01();
		ex01.pi = 3.141592;
		ex01.radius = 10;
				
		ex01.setRadius(10);
		ex01.setPi(3.141592);
		double result = ex01.areaCircle();
		System.out.println(result);
		
		System.out.println(ex01.getPi());
		System.out.println(ex01.getRadius());
		
		Ex_01 ex02 = new Ex_01();
		ex02.radius = 20;
		
		double d0001 [] = new double[3];		//double |     10.5    |       |      |
		int    i0001 [] = new    int[3];		//int    |      10     |       |      |	
		Ex_01  ex001 [] = new  Ex_01[3];		//Ex_01  | new EX_01() |       |      |
												//	       		0          1      2
												//		 |  pi  |radius|
		d0001[0] = 10.5;
		i0001[0] = 10;
		ex001[0] =  new Ex_01();
		ex01.pi = 3.141591;
		ex001[0].pi = 3.141592;
		
		
		
	}

}

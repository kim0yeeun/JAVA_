
public class Ex_02 {   // 부모클래스 
	int radius;
	double pi;
	public Ex_02(int radius, double pi) {
		this.radius = radius;
		this.pi = pi;
	}
	public double area() {
		return radius * radius * pi;
	}

}

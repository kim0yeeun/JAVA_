
public class Ex_06 {

	String name;
	int age;
	double height;
	public void setData(String name, int age, double height) {
		this.age = age;
		this.height = height;
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge () {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	public String getName() {
		return this.name;
	}
}

package package01;

public class Member {
	
	int age;
	double height;
	String name;
	boolean gender;
	
	public Member() {}
	public Member(int age, double height, String name, boolean gender) {
		this.age = age;
		this.height = height;
		this.name = name;
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	

}

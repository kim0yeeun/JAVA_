
public class Member {
	int age;
	double height;
	String name;
	
	// 생성자
	// 메서드 오버로딩 : 메서드 이름은 같지만, 매개변수의 타입이나 개수, 순서 등이 다른 것 
	public Member() {}
	public Member(int age) {
		this.age=age;
	}
	public Member(String name) {
		this.name=name;
	}
	public Member(int age, double height, String name) {
		this.age = age;
		this.height = height;
		this.name = name;
	}
	public Member(double height, int age, String name) {
		super();
		this.height=height;
		this.age=age;
		this.name=name;
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

	
	// 메서드
	
	
}

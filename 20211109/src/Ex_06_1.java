
public class Ex_06_1 {

	String name;
	int age;
	double height;
	/// 자바에서는 생성자를 클래스 이름과 같게 만들어야한다. 
	// 생성자
	
	public Ex_06_1(String name, int age, double height) { // void는 지워줘야한다. 
														  // 반환형 (void : 반환할 게 없다. )
		this.age = age;
		this.height = height;
		this.name = name;
		System.out.println("생성자 실행");
	}
	
//  메서드 : 접근지정자 반환형 함수명 (매개변수) 
	
//  접근지정자 반환형 함수명 (매개변수) 
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

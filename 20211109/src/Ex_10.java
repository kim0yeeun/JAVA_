
public class Ex_10 {
	
	String company;
	String model;
	String color;
	int maxSpeed;

	public Ex_10() {}

	public Ex_10(String company, String model, String color) {
		this(company,model); // 일일히 멤버필드 초기화하지 않아도, 초기화 된 생성자를 this메서드를 이용해서 초기화시킬 수 있다. 
							 // 아래 주석 두 문장과 같은 코드이다. 
//		this.company = company; // 공통 코드
//		this.model = model; // 공통 코드
		this.color = color;
	}
	
	public Ex_10(String company, String model, int maxSpeed) {
		this(company,model); // 공통 코드
		this.maxSpeed = maxSpeed;
	}
	
// ※※※ this() 메서드로 사용되는 생성자는 아래에 만들어 주는 것이 좋다. 
// 		공통 코드를 관리하기위한 생성자 
	public Ex_10(String company, String model) {
		this.company = company;
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
}
/* this(height) : 다른 생성자 호출을 의미
 * this.height : 멤버필드
 * this.height = height에서 두 번째 this없는 height : 매개변수
 */





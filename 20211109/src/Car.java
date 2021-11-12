
public class Car {
	// 회사, 모델, 색, 스피드
	String company;
	String model;
	String color;
	int maxSpeed;
	// 생성자 단축기 : 알트 쉬프트 에스 오 -> 제네레이트 
	public Car() {}
	public Car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 메서드 단축기 : 알트 쉬프트 에스 알 -> 제네레이트
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	

}

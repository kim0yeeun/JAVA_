package abstract_class;

///// 추상 클래스 
// 1. 추상 클래스는 무조건 상속해서 사용하고
// 2. 추상 메서드를 재정의해서 사용해야한다.
public class SmartPhone extends Phone{
	public SmartPhone(String owner) {
		super(owner);
	}
	// 자식 클래스는 추상화 x
	// 추상 클래스를 상속받으면 추상메서드를 재정의해줘야한다. 
	
	@Override
	public void turnOn() {
		System.out.println("핸드폰 전원을 킵니다.");
		
	}
	@Override
	public void turnOff() {
		System.out.println("핸드폰 전원을 끕니다.");
		
	}				
	
	

}

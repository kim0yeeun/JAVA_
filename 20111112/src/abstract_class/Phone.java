package abstract_class;

public abstract class Phone {				// 부모 클래스를 추상화시킴 : 추상클래스 
	public String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	public abstract void turnOn();			// abstract : 추상적인, 완성되어있지않은 
	public abstract void turnOff();			// 추상화 
}


//// 추상클래스 : 추상메서드를 갖고있는 클래
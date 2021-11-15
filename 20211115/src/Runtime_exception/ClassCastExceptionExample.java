package Runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		Cat cat = new Cat();
		changeDog(cat);
		
		
	}
	public static void changeDog(Animal animal) {		// 다형성 떄문에 dog도 받고 cat도 받을 수 있다. 
		if(animal instanceof Dog) {
			try {
				Cat cat = (Cat) animal;			// dog로 넘겼으면 dog로 캐스트 해야하는데 
												// cat으로 캐스트 했으니까 exception 발생 
			}catch (ClassCastException e) {
				System.out.println("입력된 개체가 잘못되었습니다.");
			}
			
		}
	}

}

class Animal{}		// 클래스에서 클래스 만들 때 public 적으면 안된다. 
					// 앞에 클래스를 적은 만큼 bin 파일에서 클래스가 생성이 된다. 
class Dog extends Animal {}
class Cat extends Animal {}
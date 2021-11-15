package Runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		Cat cat = new Cat();
		changeDog(cat);
		
		
	}
	public static void changeDog(Animal animal) {		// ������ ������ dog�� �ް� cat�� ���� �� �ִ�. 
		if(animal instanceof Dog) {
			try {
				Cat cat = (Cat) animal;			// dog�� �Ѱ����� dog�� ĳ��Ʈ �ؾ��ϴµ� 
												// cat���� ĳ��Ʈ �����ϱ� exception �߻� 
			}catch (ClassCastException e) {
				System.out.println("�Էµ� ��ü�� �߸��Ǿ����ϴ�.");
			}
			
		}
	}

}

class Animal{}		// Ŭ�������� Ŭ���� ���� �� public ������ �ȵȴ�. 
					// �տ� Ŭ������ ���� ��ŭ bin ���Ͽ��� Ŭ������ ������ �ȴ�. 
class Dog extends Animal {}
class Cat extends Animal {}
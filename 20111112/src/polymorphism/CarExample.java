package polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		for (int i=1; i<=5; i++) {
			int problemLocation = car.run(); // 타이어 터진 위치 1,2,3,4 중 하나가 날라온다. 
			switch(problemLocation) {
			case 1 : 
				System.out.println("앞왼쪽 HankookTire 교체");
				// car.frontLeftTire = new Tire("앞왼쪽",6); //Tire = Hankook 가능하다. 다형성! 
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2 :
				System.out.println("앞오른쪽 KumhoTire 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3 : 
				System.out.println("뒤왼쪽 HankookTire 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4 : 
				System.out.println("뒤오른쪽 KumhoTire 교체");
				car.backRightTire = new HankookTire("뒤오른쪽", 17);
				break;
			}
			
			// 타이어 하나가 여러개의 형태를 가질 수 있다. : 다형성 
			// 다형성의 조건 1. 자식이 부모클래스를 상속 2. 부모가 자식을 참조 
		}
	}

}

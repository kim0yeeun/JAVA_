package package01;

import package01.package001.package0001.Car;

public class Membertest {

	public static void main(String[] args) {
		Member member = new Member(); // 같은 패키지 내에 있으면 import할 필요가 없다. 
		Product product = new Product();
		Car car = new Car();
	}

}

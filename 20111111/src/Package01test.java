// import package*;    * 은 언제 어디서 사용하는!?!?!?  

import package01.Member;
import package01.package001.Board;
import package01.package001.package0001.Car;

public class Package01test {
	public static void main(String [] args) {
		Member member = new Member();
		Board board = new Board();     // 컨트롤 쉬프트 o 하면 import됨 
		Car car = new Car();
	}
}



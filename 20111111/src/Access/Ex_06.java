package Access;

import Access.access1.Ex_04;
import Access.access1.Ex_05;

public class Ex_06 {

	public static void main(String[] args) {
		Ex_04 ex04 = new Ex_04(); // 다른 패키지에서 상속
		// protected 멤버는 다른 클래스에서 사용할 수는 없다. 
		//ex04.first;
		Ex_03 ex03 = new Ex_03(); // 다른 패키지에서 상속 
		//ex03.first;
		// 상속받은 패키지도 사용할 수 없다. 
		Ex_05 ex05 = new Ex_05(); // 같은 패키지에서 상속 
		// ex05.first; 
	}

}

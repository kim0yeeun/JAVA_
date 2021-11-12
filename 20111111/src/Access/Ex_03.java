package Access;

import Access.access1.Ex_04;
//// 상속이 안된다는 걸 보여준다! 04, 05로 보기! 
//public class Ex_03 extends Ex_01{
//	public void sub() {
//		result = first - second; 다른 패키지를 상속받을 수 없다. 
//		ex01.first; // default 는 사용할 수 없다. 
//	}
//	


/// protescted 멤버는 상속이 된다. 
public class Ex_03 extends Ex_04 {  
	public void sub() {
		result = first - second;
	}
	public void div() {
		result = first / second;
	}
	
}


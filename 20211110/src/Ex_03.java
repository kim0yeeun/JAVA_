
public class Ex_03 {
	// private int first;
	int first;
	int second;
	static int val;
	int val1;
	
	
	public int add(/*Ex_03 this가 암시적으로 있는 것*/) {  // 멤버 메서드 
		return val + this.first;
	}
	public static int sub() {  // static 메서드
//		 return val - val1;
//		 static 메서드는 instance변수를 사용할 수 없다.
//		 return val + this.first; 도 사용이 안된다. 
//	  	 그렇기 떄문에 클래스 명을 적어줘야한다. 
		return val;
	}
		
		
		
		
	}

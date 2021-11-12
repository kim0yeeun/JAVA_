package inheritance;

public class Ex_05 extends Ex_04 {  // 상속하려면 ctrl + space 이름 쓰다가 모르겠으면 ctrl + space
					// 암시적으로 Ex_04의 내용이 있음을 암시한다.  
	public void sub() {
		result = first - second; 
	}
	public void mul() {
		result = first * second; 
	}

}


public class Singleton { 	// 1,2가 충족되면 이 클래스를 싱글톤으로 사용하겠다는 의미이다.
	int first;
	int second;
			static	  int 		val_1  =      20		;
	private static    int       val    =      10        ;
	
	// 자기 자신의 객체를 미리 만들어 놓고 사용 
	private static Singleton singleton = new Singleton();    		//30000 번지 
	// 1. 싱글톤을 사용할 경우에 클래스내에 자기 자신을 만들어놔야한다. 
	// static => 데이터 안에 클래스에만 존재하므로 인스턴스마다 있는 게 아니라 클래스 안에 한번 존재함 
	private Singleton() {}
	
	public static Singleton getInstance() {		// 자신의 객체를 전달 GETINSTANCE!!! 사용 
		return singleton;
		// 2. static인 애를 반환하기 위해 사용 
	}
	
	
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public static Singleton getSingleton() {
		return singleton;
	}
	public static void setSingleton(Singleton singleton) {
		Singleton.singleton = singleton;
	}
	
	
}

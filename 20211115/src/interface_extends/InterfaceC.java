package interface_extends;

// 인터페이스는 추상메서드만 갖고있기 때문에 구현할 수 없다.
// 인터페이스끼리 상속해도 구현이 안되니까 implement가 아니라 extend 확장의 개념으로 간다.

public interface InterfaceC extends InterfaceA,InterfaceB{
	public void methodC();
}

// 그래서 구현할 수가 없기 때문에 상속해도 Overriding 할 필요가 없으며
// 오류 메세지도 뜨지 않는다. 

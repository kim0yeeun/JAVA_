package interface_extends;

public class ImplementationC implements InterfaceC{
	// interfaceC만 받아오면 A,B 모두 상속받는것과 같다. 

	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");	
	}
	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}
	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
}

package interface_extends;

public class ImplementationC implements InterfaceC{
	// interfaceC�� �޾ƿ��� A,B ��� ��ӹ޴°Ͱ� ����. 

	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() ����");	
	}
	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() ����");
	}
	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() ����");
	}
}

package interface_extends;

public class implementationC_Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		InterfaceA ia = impl;
		ia.methodA();
		InterfaceB ib = impl;
		ib.methodB();
		InterfaceC ic = impl;
		ic.methodC();
		
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}

}

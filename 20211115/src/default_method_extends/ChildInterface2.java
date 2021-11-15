package default_method_extends;

public interface ChildInterface2 extends ParentInterface{
	@Override
	public default void method2() {
		System.out.println("ChildInterface2-method");	
	}
	public void method3();

}

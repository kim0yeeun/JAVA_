
public class Ex_04test {

	public static void main(String[] args) {
		Ex_04 ex04 = new Ex_04();
		ex04.setData(18,175.5,false,"이상범");
		String name = ex04.getName();
		int age = ex04.getAge();
		System.out.println(name);
		
		Ex_04 ex04_1 = new Ex_04();
		
		ex04_1.setAge(35);
		ex04_1.setGender(false);
		ex04_1.setHeight(173.5);
		ex04_1.setName("이숭무");
		
		name = ex04_1.getName();
		System.out.println(name);
		
		
		/// 객체 지향에서는 이렇게 사용하면 안된다. 
		Ex_04 ex04_2 = new Ex_04();
		ex04_2.age = 20;
		ex04_2.gender = true;
		ex04_2.height = 160.5;
		ex04_2.name = "박준현";
		System.out.println(ex04_2.name);
		
		
		
	
	}

}

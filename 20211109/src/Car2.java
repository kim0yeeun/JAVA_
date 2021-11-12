
public class Car2 {
	String model;
	String color;
	int speed;
	
	public Car2(String model) {
		this(model,"Èò»ö",250);
//		this.model = model;
//		this.color = "Èò»ö";
//		this.speed = 250;
	}
	public Car2(String model, String color) {
		
		this(model,color,230);
//		this.model = model;
//		this.color = color;
//		this.speed = 230;
	}
	public Car2(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}

	
}

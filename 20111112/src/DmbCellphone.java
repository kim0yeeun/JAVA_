
public class DmbCellphone extends Cellphone{
	int channel;
	DmbCellphone(String model, String color, int channel){
		this.model = model;
		this.color= color;
		this.channel = channel;
	}
	public void turnOnDmb() {
		System.out.println("채널" + channel + " 입니다.");
	}
	void changeChannelDmb (int channel) {
		//this.channel;
		System.out.println("채널" + channel + " 입니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	

	
	
}

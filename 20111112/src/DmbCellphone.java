
public class DmbCellphone extends Cellphone{
	int channel;
	DmbCellphone(String model, String color, int channel){
		this.model = model;
		this.color= color;
		this.channel = channel;
	}
	public void turnOnDmb() {
		System.out.println("ä��" + channel + " �Դϴ�.");
	}
	void changeChannelDmb (int channel) {
		//this.channel;
		System.out.println("ä��" + channel + " �Դϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
	

	
	
}

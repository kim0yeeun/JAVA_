
public class Cellphone {
	String model;
	String color;
	int channel;
	String message;
	
	public void powerOn() {
		System.out.println("������ ŵ�ϴ�.");
	}
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	public void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	public void sendVoice (String message) {
		System.out.println("�� : " + message);
	}
	public void receiveVoice(String message){
		System.out.println("���� : " + message);
	}
	public void hangUp(){
		System.out.println("��ȭ�� �����ϴ�.");
	}	
}
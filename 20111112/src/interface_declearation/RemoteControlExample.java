package interface_declearation;

public class RemoteControlExample {

	public static void main(String[] args) {
//		Audio audio = new Audio();
//		Television television = new Television();
// 		�ϳ��� ��ü�� ���� �ʿ� ����. 
		
		RemoteControl r; 			// �ϳ��� �������� �̿��ؼ� Audio �� TV �� ����� �� �ִ�. 
		r = new Audio();
		r.turnOn();
		r.turnOff();
		
		r = new Television();
		r.turnOn();
		r.turnOff();
	}
//									// �������̽��� " ������ "
	
}

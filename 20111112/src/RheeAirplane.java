
public class RheeAirplane extends Airplane{
	static final int NOMAL = 1; // �Ϲݺ���
	static final int SUPERSONIC = 2; // ������ ����
	
	int flymode = NOMAL; // 1
	
	public void fly() { // �������̵�
		if(flymode == SUPERSONIC) {
			System.out.println("������ ������ �Ѵ�.");	
		}else {
			super.fly();
		}
	}
	
}

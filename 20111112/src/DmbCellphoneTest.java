
public class DmbCellphoneTest {

	public static void main(String[] args) {
		DmbCellphone ex = new DmbCellphone("�ڱ���","����",5);
		
		/// �θ�κ��� ��ӹ��� �޼�����
		ex.powerOn();
		
		ex.bell();
		ex.sendVoice("��������");
		ex.receiveVoice("�̼��� �ڵ��� �³���?");
		ex.sendVoice("��, �ȳ��ϼ���.");
		ex.hangUp();
		
		System.out.println("====================");
		
		// �ڽ�Ŭ�����޼��� ����
		ex.turnOnDmb();
		ex.changeChannelDmb(12);
		ex.turnOffDmb();
		
		
	}

}

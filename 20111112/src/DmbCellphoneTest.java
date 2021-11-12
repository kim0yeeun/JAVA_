
public class DmbCellphoneTest {

	public static void main(String[] args) {
		DmbCellphone ex = new DmbCellphone("자기폰","검정",5);
		
		/// 부모로부터 상속받은 메서드사용
		ex.powerOn();
		
		ex.bell();
		ex.sendVoice("여보세여");
		ex.receiveVoice("이숭무 핸드폰 맞나요?");
		ex.sendVoice("네, 안녕하세요.");
		ex.hangUp();
		
		System.out.println("====================");
		
		// 자식클래스메서드 실행
		ex.turnOnDmb();
		ex.changeChannelDmb(12);
		ex.turnOffDmb();
		
		
	}

}

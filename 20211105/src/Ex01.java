
public class Ex01 {
	public static void main(String [] args) {
		/// ���ͳ� : �ڿ��� : �ѱ���, ����,... / �ڿ��� : ���� , �Ǽ�
		/* �ڷ��� : ���� : byte(1),char(2), short(2),int(4),long(8)
		 *        �Ǽ� : float(4), double(8)
		 *        ���� : char(2) : 'a', '��'
		 *        ���ڿ� : String : "abc", "����", "a", "��"
		 */
		// ����ȯ : �ڵ�����ȯ, ��������ȯ
		short sh = 10;
		int i = sh; // �ڵ�����ȯ
		sh = (short)i; // ��������ȯ
		short sh1 = 10;
		short sh2 = 20;
		// short sh3 = sh1 + sh2;
		int i1 = sh1 + sh2;
		short sh4 = (short)(sh1 + sh2);
		//short sh5 = (short)sh1 + (short)sh2;
		//            4byte => 2byte => 4byte
		//                ��������ȯ  �ڵ�����ȯ
		// byte => char => short => int => long => float => double
		//  �� �������δ� ������ �ڵ�����ȯ�� �Ͼ��.
		
		// ��� : ���ǹ� , �ݺ���
		// if , if ~ else , if ~ else if ~ else if ~ ... ~ else
		// switch ~ case
		int money = 3000;
		if (money >= 3000) {
			System.out.println(" ���� Ÿ�� ���ÿ�. ");
		}
		if (money >= 3000) {
			System.out.println(" ���� Ÿ�� ���ÿ�. ");
		}else {
			System.out.println(" �ɾ�ÿ�. ");
		}
	}
}





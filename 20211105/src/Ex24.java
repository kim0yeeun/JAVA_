import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stop;
		do{
			System.out.print("���� ���� �Է��� �ּ���. :");
			int startDan = sc.nextInt();
			System.out.print("������ ���� �Է��� �ּ���. :");
			int endDan = sc.nextInt();
			System.out.print("���� ���� �Է��� �ּ���. :");
			int startGop = sc.nextInt();
			System.out.print("������ ���� �Է��� �ּ���. :");
			int endGop = sc.nextInt();
			
			int dan = startDan;
			while (dan <= endDan) {
				int gop = startGop;
				while (gop <= endGop) {
					System.out.println(dan + "*" + gop +"="+dan*gop);
					gop++;
				}
				dan++;
			}
			System.out.println("�����Ϸ��� 'y'�ƴϸ� �ƹ�Ű��. : ");
			stop = sc.next();
		}while(!stop.equals("y"));
	}
}
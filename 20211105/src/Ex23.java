import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// num = int(input("ù��°���ڸ� �Է����ּ�."))
		// Scanner
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���. : ");
		String name = sc.next();
		System.out.println("�̸��� : " + name);
		System.out.print("���ڸ� �Է����ּ���. : ");
		int num = sc.nextInt();
		System.out.println("���� : " + num);
		*/
		// ����: �ܰ� ���� ������ �Է� �޾� �������� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		while(true) { // ������ �����ϱ� ���ؼ� true�� ���
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
			String stop = sc.next();
			if(stop.equals("y")) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}
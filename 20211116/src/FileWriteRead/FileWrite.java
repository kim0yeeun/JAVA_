package FileWriteRead;

// ���� open �ؼ� ���� 

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
	// ����Ʈ�� ���� ����
	public static void main(String[] args) throws IOException  {
		FileOutputStream output = new FileOutputStream("out.txt");
		output.write("���Ͽ���\n1��° �Դϴ�.\n".getBytes()); // ���ڿ��� byte Ÿ������ �ٲ� 
		output.write("2��° �Դϴ�.\n".getBytes());
		for (int i=1; i<=10; i++) {
			String data = i + "��° �Դϴ�! \n";
			output.write(data.getBytes());
		}
		output.close();						// �� ������ �Ŀ� close 
		
	}

}

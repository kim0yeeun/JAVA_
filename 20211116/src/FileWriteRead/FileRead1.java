package FileWriteRead;


import java.io.FileInputStream;
import java.io.IOException;

public class FileRead1 {
	// ����Ʈ�� �б�
	public static void main(String[] args) throws IOException {
		byte[] b = new byte[1024]; // 1kb �� �о���ڴ�.
		FileInputStream input = new FileInputStream("out1.txt");
		// ����Ʈ������ FileInputStream ���� �а���.      �о�� ����
		input.read(b); // b���ٰ� �����ؼ� ������ڴ�. 
		System.out.println(new String(b));  //����Ʈ���� ���ڿ� ������ ����ؾ߸��Ѵ�. �Ѥ�
		input.close();
		
		// ����Ʈ������ �� �Ⱥҷ��� 
		
	}

}

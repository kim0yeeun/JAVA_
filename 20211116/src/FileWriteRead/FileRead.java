package FileWriteRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	// ���ڿ��� �б�
	public static void main (String [] args) throws IOException {
		FileReader fr = new FileReader("out.txt");
		BufferedReader br = new BufferedReader(fr); // ���κ��� �����͸� �о�� �� �ִ�. 
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			System.out.println(line);
		}
		
	}

}

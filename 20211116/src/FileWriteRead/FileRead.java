package FileWriteRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	// 문자열로 읽기
	public static void main (String [] args) throws IOException {
		FileReader fr = new FileReader("out.txt");
		BufferedReader br = new BufferedReader(fr); // 라인별로 데이터를 읽어올 수 있다. 
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			System.out.println(line);
		}
		
	}

}

package FileWriteRead;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("out1.txt", true);   // , true 가 없으면 Override가 되어버린다 (append x) 
		for (int i=1; i<=20; i++) {
			fw.write(i+"번째입니다.\n");
		}
		fw.close();
	}

}

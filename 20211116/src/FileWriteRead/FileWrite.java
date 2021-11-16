package FileWriteRead;

// 파일 open 해서 쓰기 

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
	// 바이트로 쓰고 저장
	public static void main(String[] args) throws IOException  {
		FileOutputStream output = new FileOutputStream("out.txt");
		output.write("파일오픈\n1번째 입니다.\n".getBytes()); // 문자열을 byte 타입으로 바꿈 
		output.write("2번째 입니다.\n".getBytes());
		for (int i=1; i<=10; i++) {
			String data = i + "번째 입니당! \n";
			output.write(data.getBytes());
		}
		output.close();						// 다 저장한 후에 close 
		
	}

}

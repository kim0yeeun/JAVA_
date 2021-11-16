package FileWriteRead;


import java.io.FileInputStream;
import java.io.IOException;

public class FileRead1 {
	// 바이트로 읽기
	public static void main(String[] args) throws IOException {
		byte[] b = new byte[1024]; // 1kb 씩 읽어오겠다.
		FileInputStream input = new FileInputStream("out1.txt");
		// 바이트단위는 FileInputStream 으로 읽고쓴다.      읽어올 파일
		input.read(b); // b에다가 저장해서 갖고오겠다. 
		System.out.println(new String(b));  //바이트여서 문자열 단위로 출력해야만한다. ㅡㅡ
		input.close();
		
		// 바이트단위로 잘 안불러옴 
		
	}

}

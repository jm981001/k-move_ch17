package sec05;//p1034

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ButteredReaderTest {
	// TODO Auto-generated method stub
	public static void main(String[] args) throws Exception {		
		//InputStream is = System.in;
		//Reader reader = new InputStreamReader(is);	
		//BufferedReader br = new BufferedReader(reader);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 위에 3줄을 한줄로 바꾸기~
		
		
		System.out.print("입력: ");
		String lineString = br.readLine();
		
		System.out.println("출력: " + lineString);	
	}
}
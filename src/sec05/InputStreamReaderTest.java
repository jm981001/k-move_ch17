package sec05;//p1030

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//InputStream is = System.in;//바이트 기반 스트림
		//Reader reader = new InputStreamReader(is);//문자기반 스트림으로 변경
		Reader reader = new InputStreamReader(System.in);//위에 두개를 이렇게 하나로도 쓸 수 있
		int readCharNo;
		char[ ] cbuf = new char[100];//배열이용하면 속도 빨라짐
		while ((readCharNo = reader.read(cbuf)) != -1){
			String data = new String(cbuf, 0 , readCharNo);
			System.out.println(data);
		}
		
		reader.close();
	}

}

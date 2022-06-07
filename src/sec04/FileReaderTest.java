package sec04;//p1026
import java.io.FileReader;
public class FileReaderTest {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(
				"C:/K-MOVE IT/ch18/src/sec04/FileInputStreamTest.java"
				);
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo=fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		    }
		fr.close();
	}
}


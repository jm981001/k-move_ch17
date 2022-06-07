package sec04;//p1022

import java.io.FileInputStream;

public class FileInputStreamTest {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"C:/K-MOVE IT/ch18/src/sec04/FileInputStreamTest.java"
					);
			int data;
			while ( (data = fis.read() ) != -1 ) {
				System.out.write(data);
			}
			fis.close();	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}


package sec04;//p1027 문자 기반으로 내보내는거
import java.io.File;
import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("C:/Temp/file.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("FileWriter는 한글로 된 \r\n");
		fw.write("문자열을 바로 출력할수있다\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다."
				);
	}

}

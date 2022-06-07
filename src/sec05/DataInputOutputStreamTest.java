package sec05;//p1038

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.dat");
		//DataOutputStream dos = new DataOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:/Temp/primitive.dat"));//위에 두줄 한주로 줄이기~
		
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("감자바");
		dos.writeDouble(95.3);
		dos.writeInt(2);
		
		dos.flush(); dos.close(); 
		
		//FileInputStream fis = new FileInputStream("C:/Temp/primitive.dat");
		//DataInputStream dis = new DataInputStream(fis);
		DataInputStream dis = new DataInputStream(new FileInputStream("C:/Temp/primitive.dat"));
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : "+ score + " : "+ order);
		}
		
		dis.close();//fis.close();
	}

}

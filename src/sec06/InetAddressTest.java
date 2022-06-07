package sec06;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress local =  InetAddress.getLocalHost();
			System.out.println(" 내 컴퓨터 IP 주소 "+ local.getAddress());
			
			InetAddress[ ]iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println(" www.naver.com IP주소 "+ remote.getHostAddress());
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}

package java_20191204;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress i = InetAddress.getLocalHost();
		System.out.printf("호스트 이름 : %s%n",i.getHostName());
		System.out.printf("Ip address : %s%n",i.getAddress());
		
		InetAddress i1 = InetAddress.getByName("naver.com");
		
	}
}

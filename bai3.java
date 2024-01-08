package Tuan1;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class bai3 {
	public static void main(String[] args) {
		try {
			Enumeration<NetworkInterface> netInterface 
			= NetworkInterface.getNetworkInterfaces();
			while (netInterface.hasMoreElements())
			{
				NetworkInterface networkInterface
				= netInterface.nextElement();
				Enumeration<InetAddress> InetAddress
				=networkInterface.getInetAddresses();
				while ( InetAddress.hasMoreElements());{
					InetAddress address = InetAddress.nextElement();
					System.out.println("Interface:" + networkInterface.getName() +"; Dia chi IP: "+ address.getHostAddress() );
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
	
		



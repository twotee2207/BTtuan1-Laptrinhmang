package Tuan1;
import java.net.InetAddress;
public class bai2 {
public static void main (String[] args) {
try {
InetAddress inet=InetAddress.getByName("www.google.com");
System.out.println("Dia chi cua trang web google" + inet.getHostAddress());
} catch (Exception e) {
	e.printStackTrace();
	
}
}	
}

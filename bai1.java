
package Tuan1;

 
import java.net.InetAddress;


public class bai1 {

    public static void main(String[] args) {
       try {
       InetAddress inet=InetAddress.getByName("www.google.com");
       boolean isKN=inet.isReachable(5000);
                if (isKN){
                          System.out.println("Co internet");
                         }
                else 
                         {
                         System.out.println("Khong co internet ket noi");
                         }
            } 
       catch (Exception e) {
           e.printStackTrace();  
           }    
    }
}
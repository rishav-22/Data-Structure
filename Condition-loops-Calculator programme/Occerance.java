import java.util.Scanner;

import javax.net.ssl.SSLContext;

// import org.jcp.xml.dsig.internal.SignerOutputStream;

public class Occerance {
    public static void main(String[] args) {
        System.out.println("Entre the Number :");
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("Entre the numbre you check;") ;
        int num2=in.nextInt(); int count=0;
        while(num>0){
            int rem =num%10;
            if(rem==num2){ count++;}
            num/=10;
        }
System.out.println(count);
    }
}

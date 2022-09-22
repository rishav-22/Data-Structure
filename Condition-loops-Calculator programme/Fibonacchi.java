import java.util.Scanner;

import javax.security.auth.kerberos.ServicePermission;
import javax.sound.sampled.SourceDataLine;

public class Fibonacchi {
public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    int n=in.nextInt();
int a=0; int b=1; int count =2;
while(count<=n){
    int temp=b;
    b+=a;
    a=temp;
    count++;
} System.out.println(b);
    }   
    }    

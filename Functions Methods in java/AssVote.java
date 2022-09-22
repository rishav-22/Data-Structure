import java.util.Scanner;

import javax.security.auth.kerberos.ServicePermission;

public class AssVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre the Age :");
        int age= in.nextInt();
        Vote(age);
    }
    static void Vote(int age){
        if(age>18){
            System.out.println("Eligible for Vote");
        }else System.out.println("Not Eligible");
    }
}

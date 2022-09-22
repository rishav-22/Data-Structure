import java.util.Scanner;

import javax.script.ScriptContext;

public class AssPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre the numbre");
    int num = in. nextInt();
    System.out.println(Palindrome(num));
    }
    static boolean Palindrome(int num){
        int temp=num;
        int rev;
        int total=0;
        while(num>0){
            rev=num%10;
            num/=10;
            total=total*10+rev;  
        }
      return temp==total;
    }
}

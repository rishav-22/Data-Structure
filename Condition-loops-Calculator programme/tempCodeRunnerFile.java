import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch=in.next().trim().charAt(0); //--------------->>> .Trim remove all the extr space over there
        if(ch>='a'&& ch<='z'){System.out.println("LOWERCASE");} else System.out.println("UpperCase");
    }    
}

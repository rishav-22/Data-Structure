import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class AssSum {
    public static void main(String[] args) {
        Scanner in= new Scanner( System.in);
        System.out.println("Entre both numbre");
        int num1= in.nextInt();
        int num2=in.nextInt();
        System.out.println(Multiply(num1,num2));
    }
    static int sum (int a, int b){
        return a+b;
    }
    static int Multiply(int a, int b){
        return a*b;
    }
}

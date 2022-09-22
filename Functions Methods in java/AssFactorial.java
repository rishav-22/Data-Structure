import java.util.Scanner;

public class AssFactorial {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num=in.nextInt();
        System.out.println(Factorial( num));
    }
    static int Factorial(int num){
        int fact=1;
        while(num>0){
            fact*=num;
            num--;
        }
        return fact;
    }

}

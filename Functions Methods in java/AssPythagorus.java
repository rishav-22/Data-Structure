import java.util.Scanner;

public class AssPythagorus {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Entre the triplet :");
    int num1= in.nextInt();
    int num2= in.nextInt();
    int num3= in.nextInt();
    System.out.println(isPyth(num1, num2, num3));
    }

    static boolean isPyth(int a, int b, int c){
        int max=a;
        if(b>max){ max=b; if(c>max){ max=c;}}
       // System.out.println(max*max+"=="+(a*a)+(b*b)-(c*c)-max*max);
        return max*max==(a*a+b*b+c*c)-max*max;
    }
}

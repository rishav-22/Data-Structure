import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Entre the number");
        int num=in.nextInt();
        while(num>0){
            int temp=0;
            int rem=num%10;
            temp=temp*10+rem;
            System.out.print(temp);num/=10;
        }
    }
}

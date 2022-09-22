import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("ENtre the number :");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        // if(num1>num2 && num1 >num3){
        //     System.out.println(num1);
        // }else if(num2>num3){
        //     System.out.println(num2);
        // }else System.out.println(num3);

        // int max= num1;
        // if(num2>max){
        //     max=num2;
        // } if(num3>max){
        //     max=num3;
        // }
        // System.out.println(max);

        // 
        System.out.println(Math.max(num3, Math.max(num1, num2)));
    }
}

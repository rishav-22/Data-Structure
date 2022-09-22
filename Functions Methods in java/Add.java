import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class Add{
    public static void main(String[] args) {
       //Sum();
        //System.out.println(Sum2());
        System.out.println(sum3(10,15));
    }
    static void Sum(){
      Scanner in= new Scanner(System.in);
      System.out.println("Entre the first number :");
      int a= in.nextInt();
      System.out.println("entre the second Number :");
      int b= in.nextInt();
      int sum = a+b;
       System.out.println("sum is :"+ sum);  
    }
    static int Sum2  (){
      Scanner in= new Scanner(System.in);
      System.out.println("Entre the first number :");
      int a= in.nextInt();
      System.out.println("entre the second Number :");
      int b= in.nextInt();
      int sum = a+b;
      return sum;
    }
    static int sum3 (int a, int b){
      return a+b;
    }
}
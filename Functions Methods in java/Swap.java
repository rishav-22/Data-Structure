import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        // Swap();
        int a=10; int b= 20;
        swap(a,b);
        System.out.println("a :"+a+"b :"+b);
    }
    static void swap(int a, int b){
        int temp=a;           
        a=b;                     ------->>> this funnction will not change the value of a and b
        b=temp;
    }
    /*static void Swap(){
Scanner in= new Scanner(System.in);
System.out.println("entre the first number :");
int a= in.nextInt();
System.out.println("Entre the seconf nuber");
int b=in.nextInt();
System.out.println("You Entered "+a+" and "+ b+ " ");
int temp = a;
a=b;
b= temp;
System.out.println("Values after Swap is "+ a+ "and "+b);
    } */
}

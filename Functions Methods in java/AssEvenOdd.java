import java.util.Scanner;

public class AssEvenOdd {
      public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num=in.nextInt();
        Check(num);
        
      }
      static void Check(int num){
        if(num%2==0){
            System.out.println("Even");; 
        }else System.out.println("ODD");;
      }
}

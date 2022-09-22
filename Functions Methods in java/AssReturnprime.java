import java.util.Scanner;

public class AssReturnprime {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num1=in.nextInt();
        int num2 = in.nextInt();
        PrintPrime(num1,num2);
    }
    static void PrintPrime(int a,int b){
      for(int i =a; i<=b;i++){
       int count=2;
        for(int j=2;j<=b/2;j++){
            if(i%j==0){ count =0; continue;}
        }
            if(count==2){ System.out.println(i);}
        }  
        }
    }


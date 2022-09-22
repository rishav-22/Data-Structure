import java.util.Scanner;

public class Loops {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENtre the number you want to print :");
    int n=input.nextInt();
    // FOR LOOP
    // 
    // for(int i=1;i<=n; i++){
    //     System.out.println(i);
    // }

    //WHILE LOOPS
    // int count =0;
    // while(count<=n){
    //     System.out.println(count);
    //     count++;
    // }
    //DO WHILE LOOP
    int count=1;
    do{
        System.out.println(count);
        count++;
    }while(count!=n);

}}


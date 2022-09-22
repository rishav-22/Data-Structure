import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.plaf.ComponentInputMapUIResource;

public class Question {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num=in.nextInt();
        isPrimeNo(num);
        System.out.println(isPrimeNo(num));
    }
    static void isPrime(int n){
            int count =0;
            if(n>=2)
            for(int i=2;i<n;i++){
                if(n%i==0){
                    count++;
                }
            }
        if(n<2){
            System.out.println("Neither Prime no Composite");
        }else if( count!=0) {
            System.out.println("Not Prime");
        }else {
            System.out.println("Prime");
        }
    }
    static boolean isPrimeNo (int n){
        if(n<=1){
            return false;
        } int c=2; 
        while(c*c<=n){
            if(n%c==0){ return false;}
            c+=1;
        }
         return true;
    }

}
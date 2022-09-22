import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Entre the Number");
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        System.out.println( largest(a,b,c));
    }
    static int largest(int a,int b,int c){
    int max=a;  
        if(b>max){
            max=b;
            if(c>max){
                max=c;
            }
        }
        return max; 
    }

}

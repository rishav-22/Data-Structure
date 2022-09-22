import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int x= in.nextInt();
        System.out.println(Armstrong(x));
        for(int i=0;i<1000;i++){
            if(Armstrong(i)){
                System.out.print(i+"  ");
            }
        }
    }
    static boolean Armstrong(int n){ int num=n;int sum=0;
        while(n>0){
            
            int x=n%10;
            n/=10;
        sum=sum+x*x*x;
        }
        if(sum == num){return true;}else return false;
        }
    }


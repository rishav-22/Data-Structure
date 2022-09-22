import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class AssNsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=  in.nextInt();
        System.out.println(sum(num));
    } static int sum(int num){
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        return sum;
    }
}

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
       System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        int sum[]=new int[accounts.length]; int max=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
            sum[i]+= accounts[i][j];
        }
        
        
    }
    for(int i=0;i<accounts.length;i++){
        if(sum[i]>max){
            max=sum[i];
        }
    }
    return max;
        
    }
}

import java.sql.Array;
import java.util.Arrays;

public class Suffel {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,4,3,2,1};
        int [] a= Suffel(nums, 4);
        System.out.println(Arrays.toString(a));
    }
    static int[] Suffel(int[] nums,int n){
        int[] arr =new int[2*n]; int m=0,x=0;
        for(int i=0;i<n;i++){
                arr[i+m]=nums[i];
               m+=1;
        }
        for(int i=1;i<=n;i++){
            arr[i+x]=nums[n-1+i];
            x++;
        }
       return arr;
    }
}

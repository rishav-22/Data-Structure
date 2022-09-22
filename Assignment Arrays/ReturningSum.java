import java.util.Arrays;

public class ReturningSum {
    public static void main(String[] args) {
        int [] nums= {1,2,3,4};
        int [] a= RSum(nums);
        System.out.println(Arrays.toString(a));

    }
    static int [] RSum(int [] nums){
        int sum=0; int [] ans= new int[nums.length]; 
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans[i]=sum;
        }
        return ans; 
    }
}

import java.util.Arrays;

public class ArrayConcatination {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int[] a= getConcatenation(nums);
        System.out.println(Arrays.toString(a));
    }
    static int[] getConcatenation(int[] nums) {
        int[]ans= new int [2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i]; ans[nums.length+i]=nums[i];
        }
        return ans;
    }
}

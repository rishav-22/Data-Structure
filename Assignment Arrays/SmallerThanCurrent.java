import java.util.Arrays;

public class SmallerThanCurrent {
    public static void main(String[] args) {
        int [] num ={8,1,2,2,3};
        int ans[]=smallerNumbersThanCurrent( num);
System.out.println(Arrays.toString(ans));
    }
        
    static int []  smallerNumbersThanCurrent(int[] nums) {
        int [] arr = new int [nums.length];   
        for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length;j++){
                    if(nums[i]>nums[j]){
                        arr[i]++;
                    }
                }
            }
            return arr;
        }
    
}

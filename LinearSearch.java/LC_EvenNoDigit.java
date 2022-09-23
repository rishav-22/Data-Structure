import java.util.Arrays;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/

public class LC_EvenNoDigit {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        System.out.println(findNumber(25468756));
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++){
            int digit=0;
            while(nums[i]>0){
                digit++;
                nums[i]=nums[i]/10;
            }
            if(digit%2==0){
                num++;
            }
        }
        return num;
    }
// Second Method;
    static int findNumber(int num){
        if(num<0){
            num=num*-1;
        }
        return (int) (Math.log10(num)+1);  
        }
    }

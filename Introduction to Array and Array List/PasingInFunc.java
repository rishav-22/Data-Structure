import java.util.Arrays;

public class PasingInFunc {
    public static void main(String[] args) {
    int [] nums={10,11,12,14,16};
    change(nums) ;
    System.out.println(Arrays.toString(nums));  
    }
    static void change(int [] arr){
        arr[0]=99;
    }
 
}

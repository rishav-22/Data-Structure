import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArray {
    public static void main(String[] args) {
        int []nums=  {1,2,3,4,0};
      int [] index= {0,1,2,3,0};
int[] ans= createTargetArray(nums, index);
System.out.println(Arrays.toString(ans));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int arr[] =new int[index.length];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<index.length;i++){
          list.add(index[i], nums[i]);
        }
        for(int i=0;i<index.length;i++){
            arr[i]=list.get(i);
        }
return arr;
    }
}


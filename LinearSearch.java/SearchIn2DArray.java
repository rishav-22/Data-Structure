import java.lang.annotation.Target;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr ={
            {23,4,1},
            {1,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        int target=34;
        int [] ans= search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    
    //  Searching in 2D arrays
    static int[] search(int [][] arr, int target){
        int[] ans= new  int [2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j] == target){
                    ans[0]=i; ans[1]=j;
                    return new int [] {i,j};
                }
            }

        }
        return new int [] {-1,-1};

    }
}

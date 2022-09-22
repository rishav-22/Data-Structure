import java.lang.annotation.Target;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr ={
            {23,4,1},
            {1,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        int target=99;
        System.out.println(search(arr,target));
    }
    
    //  Searching in 2D arrays
    static boolean search(int [][] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}

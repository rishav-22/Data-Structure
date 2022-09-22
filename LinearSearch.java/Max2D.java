import java.lang.annotation.Target;
import java.util.Arrays;
public class Max2D{
    public static void main(String[] args) {
        int [][] arr ={
            {23,4,1},
            {1,12,3,9},
            {78,99,34,56},
            {18,12}
        };
      System.out.println(MAX(arr));
    }
    
    // Function for getting maximum of an Arrays
    static int MAX(int [][] arr){
       int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            // for(int j=0;j<arr[i].length;j++){
            //     if (arr[i][j] > max){
            //        max=arr[i][j];
            //     }
            // }
             for(int [] ints :arr){
                for(int element :ints ){
                    if(element>max){max=element;};
                }
             }

        }
       return max;
    }
}

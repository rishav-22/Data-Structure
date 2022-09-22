import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
   public static void main(String[] args) {
Scanner in = new Scanner(System.in);
    // int [][] arr= new int[3][3];
//     int [][] arr= {
//         {1,2,3},{4,5,6},{7,8,9}
//     }; 
//    }
// int [] [] arr =
// {
//     {1,2,3}, // 0th Index
//     { 1,2} , // !st Index
//     { 1,2,3,4} // 2nd Index
// };
int[][] arr = new int [3][3];
for(int row=0;row<arr.length;row++){
     for(int col=0;col<arr[row].length;col++){
        arr[row][col]=in.nextInt();  
     }
}
// for(int row=0;row<arr.length;row++){
//     for(int col=0;col<arr[row].length;col++){
//        System.out.print(arr[row][col]); 
//     } System.out.println();
// }
//  for(int i=0;i<arr.length;i++){
//     System.out.println(Arrays.toString(arr[i]));
//     System.out.println();
//  }
 for(int[] a: arr){
    System.out.println(Arrays.toString(a));
 }
   }
}

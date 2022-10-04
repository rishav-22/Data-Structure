

import java.util.ArrayList;
import java.util.List;

public class LC_SpiralMatrix {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(SpiralOrder(arr));
    }
    static List<Integer> SpiralOrder(int [][] matrix){
        List<Integer> list=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;

    
        int StartingRow=0;
        int EndingRow=row-1;
         int StartingCol=0;
         int EndingCol=col-1;

         int count=0;
         int total=row*col;
  
    while(count<total){
            for(int index=StartingCol; count < total &&index<=EndingCol;index++){
               list.add(matrix[StartingRow][index]);
                count++;
                
            }
            StartingRow++;
           
            for(int index=StartingRow; count < total &&index<=EndingRow;index++){
               list.add(matrix[index][EndingCol]);
                count++;
            }EndingCol--;
            for(int index=EndingCol; count < total &&index>=StartingCol;index--){
                list.add(matrix[EndingRow][index]);
                count++;
            }
        
            EndingRow--;
            for(int index=EndingRow; count < total &&index>=StartingRow;index--){
                list.add(matrix[index][StartingCol]);
                count++;
            }
        
            StartingCol++;
        }
        return list;
    }
}


// public class LC_SpiralMatrix{
//     public static void main(String[] args) {
//         int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//         System.out.println(spiralOrder(arr));
//     }
//    static public List<Integer> spiralOrder(int[][] matrix) {
//       List<Integer> list=new ArrayList<>(); 
    
//     int left=0;
//      int right=matrix[0].length-1;
//      int top=0;
//      int bottom=matrix.length-1;
// while(top<=bottom&&left<=right){
//      for(int i=left;i<=right;i++){
//         list.add(matrix[top][i]);
//      }
//      top++;
//      for(int i=top;i<=bottom;i++){
//         list.add(matrix[i][right]);
//      }
//      right--;
//      if(top<=bottom){
//      for(int i=right;i>=left;i--){
//         list.add(matrix[bottom][i]);
//      }
//     }
//      bottom--;
//      if(left<=right){
//      for(int i=bottom;i>=top;i--){
//         list.add(matrix[i][left]);
//      } 
//     }
//      left++;
// }
//      return list;
//     }
// }
import java.util.Arrays;

import javax.lang.model.util.ElementScanner6;

public class RowColMatrix{
 public static void main(String[] args) {
    int arr[][]={{-1,3}};
int target=3;
System.out.println(Arrays.toString(Binary(arr, target)));
System.out.println(searchMatrix(arr, target));
}
static int [] Binary(int [][] matrix,int target){
    int r=0;
    int c=matrix.length-1;
    while(r<matrix.length && c>=0 ){
        if(matrix[r][c]==target){
            return new int []{r,c};
        }
        if(matrix[r][c]<target){
            r++;
        }else{
            c--;
        }
    }
    return new int[]{-1,-1};
}
static Boolean searchMatrix(int[][] matrix, int target){
int row=matrix.length; int col=matrix[0].length;
int rowIndex=0; int colIndex=col-1;
while(rowIndex<row && colIndex>=0){
    int element=matrix[rowIndex][colIndex];
    if(element==target){
        return true;
    }
  if(element<target){
    rowIndex++;
    }else{
       colIndex--;
    }

}
return false;
}
} ;
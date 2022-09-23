//Q. https://leetcode.com/problems/transpose-matrix/submissions/

import java.util.Arrays;

public class LC_transpose{
public static void main(String[] args) {
    int arr[][]={{2,5},{1,8},{6,9} };
    int [][] ans= transpose(arr);
}
static int[][] transpose(int[][] matrix) {
    int arr[][]= new int [matrix[1].length][matrix.length];
    for(int i=0;i<matrix[0].length;i++){
        for(int j=0;j<matrix.length;j++){
         arr[i][j]=matrix[j][i];        }
        }
        for(int i=0;i<matrix[1].length;i++){
            for(int j=0;j<matrix.length;j++){
        System.out.print(arr[i][j]);
            }System.out.println();
        }
        return arr; 
    } 
     
}
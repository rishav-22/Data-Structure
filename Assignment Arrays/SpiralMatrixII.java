import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrixII {
    public static void main(String[] args) {
        int[][] ans=genrateMatrix(3);
        for (int[] n : ans) {
            System.out.print(Arrays.toString(n));
        }

    }

    static int[][] genrateMatrix(int n) {
        int arry[][]=new int [n][n];
        int x=1;
        int StartingCol = 0;
        int EndingCol =n - 1;
        int StartingRow = 0;
        int EndingRow = n - 1;
        int count = 0;
        int total = n*n;
        while (count < total) {
            for (int i = StartingCol; i <= EndingCol && count < total; i++) {
                arry[StartingRow][i]=x;x++;
               count++;
            }
            StartingRow++;
            for (int i = StartingRow; i <= EndingRow && count < total; i++) {
                arry[i][EndingCol]=x;x++;
                count++;
            }
            EndingCol--;
            for (int i = EndingCol; i >= StartingCol && count < total; i--) {
                arry[EndingRow][i]=x;x++;
                count++;
            }
            EndingRow--;
            for (int i = EndingRow; i >= StartingRow && count < total; i--) {
                arry[i][StartingCol]=x;x++;
                count++;
            }
            StartingCol++;
        }
    return arry;
    }

   
    // static int[][] ListToArray(List<Integer> list, int n) {
    //     int l = 0;
    //     int arr[][] = new int[n][n];
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             arr[i][j] = list.get(l);
    //             l++;

    //         }
    //     }
    //     return arr;
    // }
}
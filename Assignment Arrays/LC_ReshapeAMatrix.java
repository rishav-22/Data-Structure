import java.util.Arrays;

public class LC_ReshapeAMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4}};
        matrixReshape(arr, 1, 4);
    }
    static public int[][] matrixReshape(int[][] mat, int r, int c) {
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
    for(int m=0;m<mat.length;m++){
        for(int n=0;n<mat[i].length;n++){
       System.out.println(m+" "+n);
        }
        
    }
   
               
            } System.out.println();
        }
      
        return arr;
}
}

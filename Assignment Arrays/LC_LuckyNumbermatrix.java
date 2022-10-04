import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.event.ListDataEvent;

public class LC_LuckyNumbermatrix {
    public static void main(String[] args) {
        int arr[][]={{1,10,4,2},{9,3,8,7},{15,16,17,12}};

        System.out.println(luckyNumbers(arr));
    }
    

static public List<Integer> luckyNumbers (int[][] matrix) {
 ArrayList<Integer> list= new ArrayList<>();
 int arr[]=new int[matrix.length];
for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix[i].length;j++){
        int n= matrix[i][j];
        int n1=min(matrix,i);
        int n2=max(matrix,j);
        if(n==n1 && n==n2){
            list.add(0, n1);
        }
    }
}
 return list;   
}
static int min(int arr[ ][],int i){
    int x=Integer.MAX_VALUE; 
        for(int j=0;j<arr[i].length;j++){
        if(arr[i][j]<x){
            x=arr[i][j];    
            }
    }
return x;
}
static int max(int arr[][], int j){
    int x=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i][j]>x){
            x=arr[i][j];   
            }
    }
return x;
}
}

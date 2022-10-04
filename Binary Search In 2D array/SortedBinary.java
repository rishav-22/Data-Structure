import java.util.Arrays;

public class SortedBinary {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(BinarySearch(
            arr, 6)));
    }
    static int[] BinarySearch(int matrix[][],int target){
        int start=0; int end=(matrix.length*matrix[0].length)-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(matrix[mid/matrix.length][mid%matrix.length]==target){
                return new int[]{mid/matrix.length,mid%matrix.length};
            }else if(matrix[mid/matrix.length][mid%matrix.length]<target){
            start=mid+1;
            }else{
                end=mid-1;
            } 
        }
        return new int[]{-1,-1};
    }
}

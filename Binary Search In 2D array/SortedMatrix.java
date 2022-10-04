import java.lang.annotation.Retention;
import java.util.Arrays;

import javax.lang.model.element.Element;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.Soundbank;

public class SortedMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}}; 
        System.out.println(Arrays.toString(search(arr, 10)));
    };
    
    static int[] search(int [][] matrix,int target){
        int rows=matrix.length;
        int column=matrix[0].length; //      be caution Matrix maybe Empty
        if(rows==1){
            return BinarySearch(matrix, 0, 0, column-1, target);
        }

        // run the loop till two row remaining
int RowStart=0;
int RowEnd=rows-1;
int ColMid=column/2;
        while(RowStart<(RowEnd-1)){ // While this is true it have more row
int mid=RowStart+(RowEnd-RowStart)/2;
if(matrix[mid][ColMid]==target){
    return new int []{mid,ColMid};
}
if(matrix[mid][ColMid]<target){
    RowStart=mid;
}else{
    RowEnd=mid;
}
        }

        //Now we have two Rows
        //   Check weather the target is int the col 2
        if(matrix[RowStart][ColMid]==target){
            return new int []{RowStart,ColMid};
        }if(matrix[RowStart+1][ColMid]==target){
            return new int []{RowStart+1,ColMid};
        }

        //Search in first Half of array
        if(target<=matrix[RowStart][ColMid-1]){
return BinarySearch(matrix,  RowStart,0, ColMid-1, target);
        }
        //Search in second Half of array
        if(target>=matrix[RowStart][ColMid+1] && target<=matrix[RowStart][column-1]){
            return BinarySearch(matrix,  RowStart,ColMid+1, column-1, target);
        }
        //Search in third Half of array
        if(target<=matrix[RowStart+1][ColMid-1]){
            return BinarySearch(matrix,  RowStart,0, ColMid-1, target);
        }
        //Search in fourth Half of array
        else{
            return BinarySearch(matrix,  RowStart+1,ColMid+1, column-1, target);
        }
    }  

    // Search in the row between the column Provided
    static int[] BinarySearch(int [][] matrix,int rows,int Cstart,int Cend,int target){
        while(Cstart<=Cend){
            int mid=Cstart+(Cend-Cstart)/2;
            if(matrix[rows][mid]==target){
                return new int []{rows,mid};
            }
            if(matrix[rows][mid]<target){
Cstart=mid+1;
            }else
            Cend=mid-1;
        }
        return new int[]{-1,-1};
    }
}
    


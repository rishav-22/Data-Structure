import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysPermutation{
    public static void main(String[] args) {
       int [] arr= {0,2,1,5,3,4};
      int [] a= Fun(arr);
      
    //    System.out.println(Arrays.toString());
    System.out.println((Arrays.toString(a)));


    }
    static int[] Fun(int [] arr){
        int [] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[arr[i]];
        }
return arr2;
    }

}

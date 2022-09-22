import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int [] arr ={1,2,500,4,25,5,6,7,8};
        Reverse(arr);
       System.out.println(Arrays.toString(arr));
    }

    // MAx in Overall element
     
    // static int max( int arr[]){
    //     int max=arr[0];
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //     }
    //     return max;

    
    //MAx in range
    // static int  max(int[] arr,int  index1 , int index2){
    //     int max= arr[index1];
    //     for(int i=index1+1;i<index2;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //     }
    //     return max;
    // }
 // Reverse of Array
 static void swap(int [] arr, int index1,int index2 ){
    int temp=arr[index1];
    arr[index1]= arr[index2];
    arr[index2]= temp;
}
  static void Reverse(int [] arr){
int start=0; int end=arr.length-1;
while(start<end){
    swap(arr, start, end);
    start++;
    end--;
}
  }

}

 
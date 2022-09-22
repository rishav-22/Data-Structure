import java.util.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
    System.out.println((largestAltitude(gain)));
    }
    static int largestAltitude(int[] gain) {
        int n=gain.length;
        int arr[]=new int[n+1]; arr[0]=0;
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+gain[i-1];
        }
      return max(arr);
    }
     static int max(int [] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
     }
    
}

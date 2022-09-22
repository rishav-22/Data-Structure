public class FindMin {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,24,28};
        int min= Min(arr);
        System.out.println(min);
    }
    static int Min(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }

    }
    return min;
}
}

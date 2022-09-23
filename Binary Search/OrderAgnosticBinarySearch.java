public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[]={10,9,8,7,6,5,4,3,2,1};
        System.out.println(orderAgnosticBS(arr, 5));
    } 
    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        
        //Find weather array is asscending or Descending
        boolean isAss =arr[start]<arr[end];  
       while(start<= end){
        int mid=start+(end-start)/2;
        if(target==arr[mid]){
            return mid;
         } 
        else if(isAss){
             if(target<arr[mid]){
                end=mid-1;
            }else  {
                start=mid+1;
            }
           }else{
            if(target>arr[mid]){
                end=mid-1;
            }else  {
                start=mid+1;
            }
           }
         
    }
    return-1;
}
}

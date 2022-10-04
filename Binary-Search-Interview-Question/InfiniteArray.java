
// Q. // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................
public class InfiniteArray {
    public static void main(String[] args) {
int arr[]={3,5,7,9,10,90,100,130,140,160,170};
int target=9;
System.out.println(ans(arr, target));
    }
    static int ans(int []arr,int target){
        //first find the range
            // We start with the size of box 2
    int start=0;
    int end=1;

    // condition for the target to lie in the Range'
while(target>arr[end]){
    //it is new start 
    int temp=end+1;
//double the box value
// end=previous end +
end=end+(end-start+1)*2;
start=temp;
}

return Binary(arr, target, start, end);
    }
    static int Binary(int arr[], int target,int start,int end){
        while(start<= end){
            // find the middle element
            // int mid=(start+end)/2 //  might be possible that (start + end) exceeds the range of int in java
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                end=mid+1;
            }
            else{
                return mid;
            }
        }
        return-1;
    }
}

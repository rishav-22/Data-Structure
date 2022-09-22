public class Code {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9};
        System.out.println(LineraSearch(nums, 5));
    }

    // Search in the Array
    // Return the function if Found Else return -1
  
    static int LineraSearch(int [] arr, int target){
        for(int index=0;index<arr.length;index++){
            if(arr[index]==target){
                return index;
            }else return-1;
        }
    }
}

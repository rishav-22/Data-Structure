//Q. Search for '3' i range of  index 1 to 4 [18,12,-7,3,24,28]
public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,24,28};
        int target= 45; int first =1; int last =4;
        System.out.println(SearchInRange(arr, target, first, last));
    }
    static int SearchInRange(int [] arr, int target,int first , int last){
        for(int index = first;index<last;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return-1;
    }
}

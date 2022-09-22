public class Code{
    public static void main(String[] args) {
        int [] num ={1,2,3,4,5,6,7,8};
        int ans = LinerarSearch(num, 15);
        System.out.println(ans);
    }
    static int LinerarSearch(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        } return -1;
    }
}

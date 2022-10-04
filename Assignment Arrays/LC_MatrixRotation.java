public class LC_MatrixRotation{
    public static void main(String[] args) {
        int[][] arr = { {0,1},{1,0} };
        int target[][] = { { 1, 0},{0,1} };
System.out.println(findRotation(arr, target));


}
static boolean findRotation(int[][] mat, int[][] target) {
int rot=4;int flag=0;int Tlen=mat.length*target.length;
    while(rot>0){
         swap(mat);
    int count=0;
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[i].length;j++){
            if(mat[i][j]==target[i][j]){
                count++;
            }
        }
    } System.out.println(count);
    if(count==Tlen){
        flag=1; break;
    } 
    rot--;
    }
    if(flag==1){
        return true;
    }else return false;
}
static void swap(int arr[][]) {
    int NewArry[][] = new int[arr.length][arr[0].length];
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            NewArry[i][j] = arr[(arr.length - 1) - j][i];
           
        }
    }
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {

            arr[i][j] = NewArry[i][j];
        }
      
    }
}
}
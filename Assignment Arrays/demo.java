// import java.util.Arrays;

// public class demo {
//     public static void main(String[] args) {
//         int[][] arr = {
//                 { 1, 1, 0 },
//                 { 1, 0, 1 },
//                 { 0, 0, 0 },
//         };
//         flipAndInvertImage(arr);
        
//     }

//     static void flipAndInvertImage(int[][] image) {
//         int[][] Narry = new int[image.length][image.length];
//         for (int i = 0; i < image.length; i++) {
//             int l=image.length-1;
//             for (int j = 0; j < image[i].length; j++) {
//                 Narry[i][j] = image[i][l-j];
//             }
//         }
//         Change(Narry);
//         for(int i=0;i<image.length;i++){
//             for(int j=0;j<image[i].length;j++){
//                 System.out.print(Narry[i][j]);
//             } System.out.println();
//         }
//     }
//     static void Change(int [][]arr){
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 if(arr[i][j]==0){
//                     arr[i][j]=1;
//                 }else arr[i][j]=0;
//             }
//         }
//     }


// }


// public class demo{
//     public static void main(String[] args) {
//     long long l=9999999999999999999999L;
//     System.out.println(l);
//     }
// }

public class demo{
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
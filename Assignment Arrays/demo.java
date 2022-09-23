import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 },
        };
        flipAndInvertImage(arr);
        
    }

    static void flipAndInvertImage(int[][] image) {
        int[][] Narry = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            int l=image.length-1;
            for (int j = 0; j < image[i].length; j++) {
                Narry[i][j] = image[i][l-j];
            }
        }
        Change(Narry);
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                System.out.print(Narry[i][j]);
            } System.out.println();
        }
    }
    static void Change(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    arr[i][j]=1;
                }else arr[i][j]=0;
            }
        }
    }


}
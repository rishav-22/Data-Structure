import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AbstractDocument.LeafElement;

public class LC_AddToArray {
    public static void main(String[] args) {
   int num[] = { 1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};    //1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3
       addToArrayForm(num, 516);
        
    }

    static long ArraytoInt(int[] num, int k) {
        int num2 = 0;
        long dig = 0L;
        long sum = 0L;
        int len1 = num.length;
        int len2 = 0;
        for (int i = 0; i < num.length; i++) {
            num2 = num[i];
            dig = num2;
            len2 = len1;
            while (len2 - 1 > 0) {
                dig = dig * 10;
                len2--;
            }
            len1--;
            sum += dig;
            
           
        }
        sum += k;
        System.out.println(sum);
        return sum;
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        long num1 = 0L;
        num1= ArraytoInt(num, k);
        //int len=arr.length;
        // for (int i = 0; i > arr.length; i++) {
            while (num1 > 0) {
              long n = num1 % 10;
              int x=(int)n;
            num1 /= 10;
               list.add(0, x);
            // } 
          //  len--;
        }
        System.out.println(list);
       return list;
    }

}

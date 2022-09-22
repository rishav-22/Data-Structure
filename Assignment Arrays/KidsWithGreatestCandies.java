import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.event.ListDataEvent;

public class KidsWithGreatestCandies {
    public static void main(String[] args) {
     int Candies []={2,3,5,1,3};
     List<Boolean> list= kidsWithCandies(Candies,3);
     System.out.println(list);
    }
    static int max(int[] candies){
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){ max=candies[i];}
        }
        return max;
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int arr[]= new int[candies.length];
        for(int i=0;i<candies.length;i++){
            arr[i]=candies[i]+extraCandies;
        }
        for(int i=0;i<candies.length;i++){
            if(arr[i]>=max( candies)){
                list.add(true);
            }else list.add(false);
        }
        return list;
    }
}

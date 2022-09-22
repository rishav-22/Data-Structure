import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ArrayListExample{
    public static void main(String[] args) {
Scanner in= new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>(10);
        // list.add(123 );
        // list.add(12 );
        // list.add(1243 );
        // list.add(123 );
        // list.add(12354); 
        // list.add(1233 );
        // list.add(1 );
        // list.add(12553 );
        // list.add(1233);
        // list.add(55);
        // list.add(8947 );
        // list.add(000 );
        // list.add(23 );
        // list.add(13 );
        // list.add(12311 );
        // list.add(1233 );
        // list.add(1233 );
        
        // list.remove(2); 
        // list.set(0 , 125); 
        // System.out.print(list);
        // System.out.println(list.contains(0111));

        // input
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
  // get item at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i)); //pass index here , list[index] syntax will not work here   
        }


    }
     
}
import java.util.Scanner;

 import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

public class switchFruiet {
    public static void main(String[] args) {            
        Scanner in = new Scanner(System.in);
            System.out.println("Entre the fruiet  :");
            String fruiet=in.nextLine();
            switch(fruiet){
                 case "Mango" :
                System.out.println("King of fruiet");
                break;
                case "Apple":
                System.out.println("A red Sweet fruiet");
                break;
                case "Grapes" :
                System.out.println("A samll Fruiet");
                break;
                 default:
                 System.out.println("Please Wntre a valid fruiet");
                 

            }

    }
}


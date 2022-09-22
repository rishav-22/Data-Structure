import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
       String name = "kunal";
        char target = 'f';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray())); // create a character array of name
    }
    static boolean search(String str, char target){
       for(char ch : str.toCharArray()){   // Converting string to char array
        if(ch==target){
            return true;
        }
       }
        return false;
    }
}

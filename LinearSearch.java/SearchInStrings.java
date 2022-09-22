public class SearchInStrings {
    public static void main(String[] args) {
       String name = "kunal";
        char target = 'f';
        System.out.println(search(name, target));
    }
    static boolean search(String str, char target){
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}

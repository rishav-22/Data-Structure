import java.nio.channels.AsynchronousByteChannel;
import java.util.Arrays;

import org.w3c.dom.stylesheets.StyleSheetList;

public class VarArgs {
    public static void main(String[] args) {
        fun( 2,4,"Rishav Kuchiya");
        Demo("KUNAL KUSHWAHA","RISHAV");
        Demo(1)
    }
    static void fun(int a, int b,String ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(a );
    }
    static void Demo(int ...v){
System.out.println(Arrays.toString(v));
    }
    static void Demo(String ...v){
System.out.println(Arrays.toString(v));
    }

}

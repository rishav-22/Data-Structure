import javax.sound.sampled.SourceDataLine;

public class Shadowing {
     static int x=90;   //----->>> will be available for everything inside the block
public static void main(String[] args) {
    System.out.println(x);   //90
 }
{  int x;
    // System.out.println(x);---->> scope will beggin when value is initialised
    x=70;
    System.out.println(x);   //70
}

}

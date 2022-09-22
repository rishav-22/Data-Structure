import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
      // System.out.println(greet()); 
      Scanner in = new Scanner(System.in);
      System.out.println("entre your name");
      String name=in.nextLine();
       String Personalised= myGreet(name);
       System.out.println(Personalised);
    }
    static String myGreet(String name ){
        String message="Hello "+ name;
        return message;
    } 
    static String greet(){
        String greeting ="How are you";
        return greeting;  
    }
}

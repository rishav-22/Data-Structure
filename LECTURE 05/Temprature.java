import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Entre the Temp in Celciuse : ");
    float Temp=input.nextInt();
    float tempF=(Temp*9/5)+32;
    System.out.println("Your temrature in Farhenite is :"+ tempF);    

    }
}

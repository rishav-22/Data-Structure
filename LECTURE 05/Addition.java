import java.util.Scanner;

import javax.xml.validation.Schema;

public class Addition {
    public static void main(String[] args) {
        // getting input two number and Adding them
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1= input.nextInt();
        System.out.println("Enter the Second number :");
        int num2= input.nextInt();
        System.out.println("The sum is :"+ (num1+num2));
    }
}

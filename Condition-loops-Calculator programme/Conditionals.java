import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre the Salary :");
        float salary= input.nextFloat();
        if(salary<=10000){
            salary+=1000;
            System.out.println("salary after bonus is :"+ salary);
        }else if(salary>10000&&salary<=20000){
            salary+=2000;
            System.out.println("salary after bonus is :"+ salary);
        }else {
            salary+=3000;
            System.out.println("salary after bonus is :"+ salary);
        }
    }
}

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TypeCasting type 1---> getting integer in a float type ;
        // float num = input.nextInt();
        // System.out.println(num);
        
        // int num = input.nextFloat()---> gives error because of destination is lesser than source float<int while float = decimal+int
        //  int num = 55.654f;----->> gives error because of float cant be typecast in integer;
         
    // AUTOMATIC TYPE PRAMOTION IN ACTION 
    // int a=257;
    // byte b= (byte)(a);
    // System.out.println(b);---->> Since byte can only store till 256 so for storing 257 it will give outut as (257%256=1)
    
    
    // byte a=40;
    // byte b= 50;
    // byte c=100;  ---------->> since max xapacity of a and b pf byte type is 256, but a*b gives 2000 so on performing operation java will automtically pramote to int type 
    // int d = a*b/c;
    // System.out.println(d);

    // byte b = 50;
    // b=(b*2);----->> it will give error because on performing operation java will pramote in int but just before b in cast byte so it will give error 
      
    // int num ='A';
    // System.out.println(num);------->> it will do automatic type casting and print the Ascii code

    byte b=42;
    char c='A';
    short s=1024;
    int i =50000;
    float f=5.67f;
    double d = 0.1234;
    double result = (f*b)+( i/c)-(d-s);
    System.out.println((f*b)+"  "+( i/c)+"  "+(d-s));
    System.out.println(result);
}
}

public class Overloading {
    public static void main(String[] args) {
     fun(255,5,40);
     fun("Kunal");       
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int a, int b){
        System.out.println(a+b);
    }
    static void fun(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void fun(String s){
        System.out.println(s);
    }
    
    }

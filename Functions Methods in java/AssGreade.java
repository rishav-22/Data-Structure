import java.util.Scanner;

public class AssGreade {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Entre your Marks :");
        int Marks=in.nextInt();
        marks(Marks);
    }
    static void marks(int m){
        if(m<=100 && m>91){ System.out.println("AA"); }
        else if(m<=90 && m>81){ System.out.println("AB");}
        else if(m<=80&& m>71){ System.out.println("BB");}
        else if(m<=70 && m>61){ System.out.println("BC");}
        else if(m<=60 && m>51){ System.out.println("CD");}
        else if(m<=50 && m>41){ System.out.println("DD");}
        else if(m<=40){ System.out.println("Fail");}

    }
}

import java.util.Scanner;
//CREATED BY PRATHAMKUMAR SOYA
//ID NO. :21ce139

public class pr3 {
    public static void main(String[] args) {
        System.out.println("CREATED BY PRATHAMKUMAR SOYA");
        System.out.println("ID NO. :21ce139");

        Scanner p= new Scanner(System.in);
        int a,b;
        System.out.println("a=");
        a= p.nextInt();
        System.out.println("b=");
        b= p.nextInt();
        if(a==b%10)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}

import java.util.Scanner;
//CREATED BY PRATHAMKUMAR SOYA
//ID NO. :21ce139

public class pr2 {
    public static void main(String[] args)
    {
        System.out.println("CREATED BY PRATHAMKUMAR SOYA");
        System.out.println("ID NO. :21ce139");
        Scanner sc= new Scanner(System.in);
        String a;
        System.out.println("Enter string:");
        a=sc.next();
        if(a.charAt(0)=='o')
        {
            System.out.print("o");
            if(a.charAt(1)=='z')
            {
                System.out.println("z");
            }
        }
        else if (a.charAt(1)=='z')
        {
            System.out.println('z');
        }
        else
        {
            System.out.print(a.charAt(0));
            System.out.print(a.charAt(1));
        }
    }
}

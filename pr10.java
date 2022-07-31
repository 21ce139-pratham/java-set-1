import java.util.*;
//CREATED BY PRATHAMKUMAR SOYA
//ID NO. :21ce139

public class pr10 {
    public static void main(String[] args)
    {
        System.out.println("CREATED BY PRATHAMKUMAR SOYA");
        System.out.println("ID NO. :21ce139");

        Scanner sc= new Scanner(System.in);
        String a;
        char[] b=new char[40];
        a=sc.next();
        char x;
        int y;
        int n = a.length();
        for(int i=0;i<n;i++)
        {
            x=a.charAt(i);
            y=x+13;
            if(y>122)
            {
                y=y-26;
            }
            else if(y>90)
            {
                y=y-26;
            }
            b[i]=(char)y;
        }
        System.out.println("main String :"+a);
        System.out.print("Encrypt : ");
        for (int i=0;i<n;i++)
        {
            System.out.print(b[i]);
        }
    }
}

import java.util.*;
//CREATED BY PRATHAMKUMAR SOYA
//ID NO. :21ce139

public class pr5
{
    public static void main(String[] args)
    {
        System.out.println("CREATED BY PRATHAMKUMAR SOYA");
        System.out.println("ID NO. :21ce139");

        Scanner sc= new Scanner(System.in);

        String a;
        String b;
        System.out.print("Enter String a:");
        a=sc.next();
        System.out.print("Enter String b:");
        b=sc.next();
        int p=a.length();
        int q=b.length();
        int n=0;
        int count=0;
        if(p>q)
        { n=q; }
        else
        { n=p; }
        for(int i=0;i<n-1;i++)
        {
            if(a.charAt(i)==b.charAt(i))
            {
                if(a.charAt(i+1)==b.charAt(i+1))
                { count++; }
            }
        }
        System.out.println(count);
    }
}
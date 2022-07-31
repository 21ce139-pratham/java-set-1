import java.util.*;
//CREATED BY PRATHAMKUMAR SOYA
//ID NO. :21ce139

public class pr8 {
    public static void main(String[] args)
    {
        System.out.println("CREATED BY PRATHAMKUMAR SOYA");
        System.out.println("ID NO. :21ce139");

        char[][] a=new char[][]
                {
                        {'A','B','A','C','C','D','E','E','A','D'},
                        {'D','B','A','B','C','A','E','E','A','D'},
                        {'E','D','D','A','C','B','E','E','A','D'},
                        {'C','B','A','E','D','C','E','E','A','D'},
                        {'A','B','D','C','C','D','E','E','A','D'},
                        {'B','B','E','C','C','D','E','E','A','D'},
                        {'B','B','A','C','C','D','E','E','A','D'},
                        {'E','B','E','C','C','D','E','E','A','D'}
                };
        char[] b=new char[]
                {'D','B','D','C','C','D','A','E','A','D'};
        for(int i=0;i<8;i++)
        {
            int count=0;
            for(int j=0;j<10;j++)
            {
                if(a[i][j]==b[j])
                { count++; }
            }
            System.out.println("Correct answers of "+i+"Student :"+count);
        }
    }
}

import java.util.*;
//CREATED BY PRATHAMKUMAR SOYA
//ID NO. :21ce139

public class pr4 {
    public static void main(String[] args) {
        System.out.println("CREATED BY PRATHAMKUMAR SOYA");
        System.out.println("ID NO. :21ce139");

        Scanner sc= new Scanner(System.in);
        int arr[]=new int[20];
        int a;
        System.out.println("Length of string:");
        a=sc.nextInt();
        System.out.println("Enter string:");
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a-2;i++) {
            if (arr[i] == 1) {
                if (arr[i + 1] == 2) {
                    if (arr[i + 2] == 3) {
                        System.out.println("true");
                        break;
                    }
                }
            }
            else
            {
                System.out.println("false");
            }

        }
//            if(count==1)
//            {
//                System.out.println("true");
//            }

    }
}

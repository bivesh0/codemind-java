import java.util.*;
class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=3)
        {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println(); 
        }
        for(int i=n-1;i>0;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
             System.out.println(); 
        }
        }
        else
          System.out.println("The pattern is not possible"); 
    }
}
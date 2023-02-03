import java.util.*;
class A
{
    public static void main(String args[])
    {
        int m,n,i;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {   if(i%2!=0)
            System.out.println(m+" x "+i+" = "+m*i);
        }
    }
}
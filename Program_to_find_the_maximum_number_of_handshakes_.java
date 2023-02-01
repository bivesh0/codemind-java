import java.util.*;
class max
{
    public int max(int n)
    {
       int res;
       res=(n*(n-1))/2;
       return res;
    }
    public static void main(String args[])
    {
        max obj=new max();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(obj.max(num));
    }
}
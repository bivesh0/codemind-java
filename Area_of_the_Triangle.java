import java.util.*;
class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        float s=(a+b+c)/2;
        double res=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",res);
    }
}
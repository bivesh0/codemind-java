import java.util.*;
class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float temp=sc.nextFloat();
        double f=(float)32+(temp*1.8);
        System.out.format("%.2f",f);
    }
}
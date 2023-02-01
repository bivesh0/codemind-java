import java.util.*;
class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int track=sc.nextInt();
        int sector=sc.nextInt();
        int block=sc.nextInt();
        //disk has 2 sufaces and each blocks has 512 bytes memory
        long cap=(track*sector*(block*512))*2;
        System.out.println(cap);
    }
}
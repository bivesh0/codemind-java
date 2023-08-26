import java.util.Scanner;
public class A{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String r=sc.next();
        int c=0;
        for(int i=0;i<r.length();i++){
            if(r.charAt(i)>='A' && r.charAt(i)<='Z')
                c=c+1;
            else if(i==0) c=c+1;  
        }
        System.out.print(c);
    }
}
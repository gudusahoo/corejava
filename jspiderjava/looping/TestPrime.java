import java.util.Scanner;
class TestPrime
{
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a number");
                int n=scn.nextInt();
        int a=0;
        
        for(int i=2;i<n;i++)
        {
            if(n%i==0 )
            {
                a=1;                
               break; 
            }
        }
         
        if(a==0)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}
        
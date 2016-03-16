class Demo7
{
    public static void main(String args[])
    {
        /*java.util.Scanner scn=new java.util.Scanner(System.in);
                       int n=scn.nextInt();*/
           int n=50;
        for(int i=1;i<=50;i++)
        {
            if(isPrime(i))
                System.out.println(i);
        }
    }
    static boolean isPrime(int n)
    {
        if(n<2)
            return false;
        for(int i=2;i<n;i++)
           {
            
            if(n%i==0)
            {
                return false;
            }
           
        }
         return true;
    }
}
    
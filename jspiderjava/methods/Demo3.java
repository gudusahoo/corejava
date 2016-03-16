class Demo3
{
    public static void main(String args[])
    {
        if(m1()==10)
        {
            System.out.println("i is 10");
            
        }
        else
            {
                System.out.println("i is not 10");
            }
    }
    
    static int m1()
    {
        java.util.Scanner scn=new java.util.Scanner(System.in);
        System.out.println("enter a number");
        int a=scn.nextInt();
        return a;
    }
}
    
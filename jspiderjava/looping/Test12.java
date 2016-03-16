import java.util.*;
class Test12{
    public static void main(String args[])
    {
      Scanner scn=new Scanner(System.in);
        //System.out.println("enter a size");
        //int n=scn.nextInt();
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==1||j==1||i==5||j==5)
                    //||i==n||j==n
                    System.out.print("*");
                else
                    System.out.print(" ");
                
            }
            System.out.println();
     
             }
    }
}

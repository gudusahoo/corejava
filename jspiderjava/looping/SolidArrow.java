class SolidArrow
{
    public static void main(String args[])
    { 
        int star=1;int n=9;
        for(int i=1;i<=9;i++)
        {
        for(int j=1;j<=star;j++)
        {
            System.out.print("*");
        }
            if(i<=n/2)
            {       star++;
            }
            
            else
            {star--;}
                
            System.out.println();
        }
    }
}

        
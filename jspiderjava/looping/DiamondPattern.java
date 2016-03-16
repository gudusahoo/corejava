class DiamondPattern{
    public static void main(String args[])
    {
        int n=9;int sps=4;int stars=1;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sps;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=stars;k++)
            {
                System.out.print("*");
            }
            if(i<=n/2)
            {
            sps--;
            stars+=2;
            }
            else
            {
            sps++;
                stars-=2;
            }
            System.out.println();
        }
    }
}

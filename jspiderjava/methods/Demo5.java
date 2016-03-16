class Demo5
{
    public static void main(String args[])
    {
        int i,j;
        i=0;
       // j=m1(++i); i=1,j=1
        j=m1(i++);
        System.out.println(i);
        System.out.println(j);
    }
    static int m1(int a)
    {
        return a++;
    }
}
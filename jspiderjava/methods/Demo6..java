class Demo6
{
    public static void main(String args[])
    {
        int i,j;
        i=0;
       j=m1(i++)+m2(++i)+m1(i--);
	   System.out.println(i);
        System.out.println(j);
    }
    static int m1(int a)
    {
        return a++;
    }
	static int m2(int a)
    {
        return a--;
    }
}
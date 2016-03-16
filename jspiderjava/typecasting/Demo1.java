class Demo1
{
    public static void main(String args[])
    {
        int i=10;
        test1(i);
        test2(i);
        test2((double)i);
    }
    static void test1(double arg0)
    {
       System.out.println("test1(double)");
    }
   static void test2(int  arg0)
    {
       System.out.println("test2(int)");
    }
        static void test2(double arg0)
    {
       System.out.println("test2(double)");
    }
}

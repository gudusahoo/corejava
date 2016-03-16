
class A
{
    static int i;
        static void display()
    {
           System.out.println("display starts");
        System.out.println(i);
        System.out.println("display ends");
    }
}
class Demo4
{
    public static void main(String args[])
    {
        A.display();
        A.i=10;
        A.display();
    }
}
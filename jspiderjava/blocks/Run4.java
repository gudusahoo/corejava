class A
{
    {
            System.out.println("non static block");
    }
    A()
    {
        System.out.println("constructor");
    }
}
class Run4
{
    public static void main(String args[])
    {
        new B();
        new B();
    }
}
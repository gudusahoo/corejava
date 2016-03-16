class A
{
    A()
    {
        System.out.println("constructor");
    }
}
class Run1
{
    public static void main(String args[])
    {
        new A();
        new A();
    }
}
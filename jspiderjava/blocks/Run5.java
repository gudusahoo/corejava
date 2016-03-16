class B
{
    static 
    {
        System.out.println("static block");
    }
    {
        System.out.println("non static block");
    }
    B()
    {
        System.out.println("constructor");
    }
}
class Run5
{
    static 
    {
        System.out.println("static block run5");
    }
    public static void main(String args[])
    {
        new B();
        new B();
    }
}
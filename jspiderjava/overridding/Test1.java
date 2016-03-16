class A
{
    void m1()
    {
        System.out.println("m1() in A");
    }
}
class B extends A
{
    void m1()
    {
        super.m1();
        System.out.println("m1() in b");
    }
}
class Test1
{
    public static void main(String args[])
    {
        B b1=new B();
        b1.m1();
    }
}
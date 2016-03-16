abstract class A
{
    abstract void m1();
    void m2()
    {
        System.out.println("m2() in A");
    }
}
class B extends A
{
    void m1()
    {
        System.out.println("m1() in B");
    }
}
class Run1
{
    public static void main(String args[])
    {
        A a1=new B();
        a1.m1();
        a1.m2();
    }
}